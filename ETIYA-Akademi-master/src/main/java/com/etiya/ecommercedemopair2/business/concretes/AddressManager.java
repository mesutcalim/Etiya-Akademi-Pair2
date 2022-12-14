package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.AddressService;
import com.etiya.ecommercedemopair2.business.abstracts.CountryService;
import com.etiya.ecommercedemopair2.business.dtos.request.address.AddAddressRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.address.AddAddressResponse;
import com.etiya.ecommercedemopair2.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Address;
import com.etiya.ecommercedemopair2.repository.abstracts.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressManager implements AddressService {
    private AddressRepository addressRepository;
    private CountryService countryService;
    private ModelMapperService modelMapperService;
//    @Override
//    public AddAddressResponse addAddress(AddAddressRequest addAddressRequest) {
//        Address address =
//                modelMapperService.getMapper().map(addAddressRequest,Address.class);
//        Address savedAddress = addressRepository.save(address);
//        AddAddressResponse response=
//                modelMapperService.getMapper().map(savedAddress,AddAddressResponse.class);
//
//        return response;
//    }
//
//    @Override
//    public Address getById(int id) {
//        //return addressRepository.findById(id).orElseThrow();
//        return checkIfAddressExistsById(id);
//    }
@Override
public DataResult<AddAddressResponse> addAddress(AddAddressRequest addAddressRequest) {

    Address address=modelMapperService.getMapper().map(addAddressRequest,Address.class);

    Address savedAddress=addressRepository.save(address);

    AddAddressResponse response=
            modelMapperService.getMapper().map(savedAddress,AddAddressResponse.class);
    return new SuccessDataResult<AddAddressResponse>(response,"Adres eklendi.");
}

    @Override
    public DataResult<Address> getById(int address_id) {
        //return addressRepository.findById(address_id).orElseThrow();
        return new SuccessDataResult<Address>
                (this.checkIfAddressExistsById(address_id),"Data getirildi.");

    }

    private Address checkIfAddressExistsById(int address_id){
        Address currentAddress = addressRepository.findById(address_id).orElseThrow();
        return currentAddress;
    }
}

