package com.spring.transaction.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.transaction.api.entity.Address;
import com.spring.transaction.api.repository.AddressRepository;

@Service
public class AddressServices {

	@Autowired
	private AddressRepository addRepo;
	
	public Address addAddress(Address address) {
		Address addAddress = this.addRepo.save(address);
		
		return addAddress;
	}
}
