package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	// inject the EmployeeService here
	@Autowired
	private EmployeeService employeeService;

	// Design the REST API which return the string to that method
	@GetMapping("/getTest")
	public String getTestData() {
		return "employee";
	}

	// Design the REST API which return the Student names to that method
	@GetMapping("/getStudentList")
	public List<String> getStudentList() {
		List<String> list = new ArrayList<String>();
		list.add("ajay");
		list.add("rohan");
		list.add("ashwin");
		return list;
	}

	// Design REST API which return the employee object
	@GetMapping("/getEmployee")
	public Employee getEmployeeData() {
		Employee employee = new Employee();
		return employee;
	}

	// Design the API or Restful Web Service or REST API to save the Employee
	// information into database
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
		Employee employee = employeeService.saveEmployee(emp);
		return ResponseEntity.ok().body(employee);
	}

}
