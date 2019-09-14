package com.springboot.curddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.curddemo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> findAll() {
		
		Query theQuery= entityManager.createQuery("from Employee");
		
		List<Employee> employees= theQuery.getResultList();
		
		return employees;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
		Employee dbemployee=entityManager.merge(employee);
		
		employee.setId(dbemployee.getId());

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		Query theQuery= entityManager.createQuery("delete from Employee where id=:employeeId");
		
		theQuery.setParameter("employeeId", id);
		
		theQuery.executeUpdate();

	}

}
