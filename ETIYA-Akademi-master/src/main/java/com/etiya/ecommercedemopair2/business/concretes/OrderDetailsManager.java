package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.InvoiceService;
import com.etiya.ecommercedemopair2.business.abstracts.OrderDetailsService;
import com.etiya.ecommercedemopair2.business.abstracts.OrderService;
import com.etiya.ecommercedemopair2.business.abstracts.ProductService;
import com.etiya.ecommercedemopair2.business.dtos.request.orderDetails.AddOrderDetailsRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.orderDetails.AddOrderDetailsResponse;
import com.etiya.ecommercedemopair2.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Invoice;
import com.etiya.ecommercedemopair2.entities.concretes.OrderDetail;
import com.etiya.ecommercedemopair2.entities.concretes.Product;
import com.etiya.ecommercedemopair2.repository.abstracts.InvoiceRepository;
import com.etiya.ecommercedemopair2.repository.abstracts.OrderDetailsRepository;
import com.etiya.ecommercedemopair2.repository.abstracts.OrderRepository;
import com.etiya.ecommercedemopair2.repository.abstracts.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.*;

@Service
@AllArgsConstructor
public class OrderDetailsManager implements OrderDetailsService {
    private OrderDetailsRepository orderDetailsRepository;
    private OrderService orderService;
    private ProductService productService;
    private InvoiceService invoiceService;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<AddOrderDetailsResponse> addOrderDetails(AddOrderDetailsRequest addOrderDetailsRequest) {
        OrderDetail orderDetail=modelMapperService.getMapper().map(addOrderDetailsRequest,OrderDetail.class);

        OrderDetail savedOrderDetail = orderDetailsRepository.save(orderDetail);

        AddOrderDetailsResponse response=
                modelMapperService.getMapper().map(savedOrderDetail,AddOrderDetailsResponse.class);
        return new SuccessDataResult<AddOrderDetailsResponse>(response,"Sipariş Detayı Eklendi.");
    }

    @Override
    @Transactional
    public DataResult<AddOrderDetailsResponse> addOrderDetailsWithTransaction(AddOrderDetailsRequest addOrderDetailsRequest) {
        List<Integer> productIdList = addOrderDetailsRequest.getProductId();
        List<Product> productList = new ArrayList<>();
        double totalTemporal=0.0;
        for(int p:productIdList){
            Product product= productService.getById(p).getData();
            totalTemporal += product.getUnit_price();
            productList.add(product);
        }

        OrderDetail orderDetail= OrderDetail.builder()
                .products(productList)
                .order(orderService.getById(addOrderDetailsRequest.getOrderId()).getData())
                .build();

        Invoice invoice = Invoice.builder()
                .customerName(orderService.getById(addOrderDetailsRequest.getOrderId()).getData().getCustomer().getUser().getFirst_name())
                .invoice_date(LocalDate.now())
                .total(totalTemporal)
                .orderDetail(orderDetailsRepository.findById(addOrderDetailsRequest.getOrderId()).orElseThrow())
                .build();

        Invoice savedInvoice = invoiceService.addInvoice(invoice);
        OrderDetail savedOrderDetail = orderDetailsRepository.save(orderDetail);

        AddOrderDetailsResponse response=
                modelMapperService.getMapper().map(savedOrderDetail,AddOrderDetailsResponse.class);
        return new SuccessDataResult<AddOrderDetailsResponse>(response,"Sipariş Detayı Eklendi.");
    }
}
