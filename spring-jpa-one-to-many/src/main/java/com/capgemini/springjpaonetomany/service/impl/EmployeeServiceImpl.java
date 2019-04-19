package com.capgemini.springjpaonetomany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springjpaonetomany.dao.EmployeeDao;
import com.capgemini.springjpaonetomany.entity.Employee;
import com.capgemini.springjpaonetomany.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	@Override
	public void add(Employee employee) {
		dao.save(employee);
		
	}

}
