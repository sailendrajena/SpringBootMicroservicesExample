package com.spring.transaction.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.transaction.api.entity.Address;
import com.spring.transaction.api.entity.Employee;
import com.spring.transaction.api.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private AddressServices addServices;
	
	@Transactional
	public Employee addEmployee(Employee employee) throws Exception{
		Employee addEmployee = empRepo.save(employee);
		
//		Address add = new Address();
		Address add = null;
		add.setId(122L);
		add.setAddress("Odisha");
		add.setEmployee(employee);
		
		this.addServices.addAddress(add);
		
		return addEmployee;
	}
}
