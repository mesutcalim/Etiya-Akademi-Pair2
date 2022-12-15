package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.salesman.AddSalesmanRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.salesman.AddSalesmanResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;

public interface SalesmanService {
    DataResult<AddSalesmanResponse> addSalesman(AddSalesmanRequest addSalesmanRequest);
}
