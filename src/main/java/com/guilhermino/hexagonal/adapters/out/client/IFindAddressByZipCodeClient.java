package com.guilhermino.hexagonal.adapters.out.client;

import com.guilhermino.hexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "IFindAddressByZipCodeClient",
        url = "${guilhermino.client.address.url}"
)
public interface IFindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
