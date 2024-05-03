package com.spring.transaction.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.transaction.api.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
