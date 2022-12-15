package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.PaymentMethodService;
import com.etiya.ecommercedemopair2.business.dtos.request.paymentMethod.AddPaymentMethodRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.paymentMethod.AddPaymentMethodResponse;
import com.etiya.ecommercedemopair2.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;
import com.etiya.ecommercedemopair2.repository.abstracts.PaymentMethodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentMethodManager implements PaymentMethodService {
    private PaymentMethodRepository paymentMethodRepository;
    private ModelMapperService modelMapperService;
    public DataResult<List<PaymentMethod>> getAll(){
        return new SuccessDataResult<List<PaymentMethod>>(paymentMethodRepository.findAll(),"Data Listelendi.");

    }

    @Override
    public DataResult<PaymentMethod> getById(int id) {
        return new SuccessDataResult<PaymentMethod>(paymentMethodRepository.findById(id).orElseThrow(),"Id'ye göre listelendi.");

    }

    @Override
    public DataResult<AddPaymentMethodResponse> addPaymentMethod(AddPaymentMethodRequest addPaymentMethodRequest) {
        PaymentMethod paymentMethod=modelMapperService.getMapper().map(addPaymentMethodRequest,PaymentMethod.class);

        PaymentMethod savedPaymentMethod=paymentMethodRepository.save(paymentMethod);

        AddPaymentMethodResponse response =
                modelMapperService.getMapper().map(savedPaymentMethod,AddPaymentMethodResponse.class);

        return new SuccessDataResult<AddPaymentMethodResponse>(response,"Ödeme yöntemi eklendi.");
    }
}
