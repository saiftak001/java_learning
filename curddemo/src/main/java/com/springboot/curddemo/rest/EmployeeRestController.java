package com.springboot.curddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.curddemo.entity.Employee;
import com.springboot.curddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {

		Employee theEmployee = employeeService.findById(employeeId);

		if (theEmployee == null) {
			throw new RuntimeException("Employee not found " + employeeId);
		}

		return theEmployee;
	}

	@PostMapping("/employees/{employeeId}")
	public Employee addEmployee(@RequestBody Employee theEmployee) {

		theEmployee.setId(0);

		employeeService.save(theEmployee);

		return theEmployee;
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {

		employeeService.save(theEmployee);

		return theEmployee;
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		Employee employee= employeeService.findById(employeeId);
		
		if(employee==null) {
			throw new RuntimeException("Employee doest not exist "+employeeId);
		}
		
		employeeService.deleteById(employeeId);
		
		return "Employee Deleted "+employeeId;

	}

}
