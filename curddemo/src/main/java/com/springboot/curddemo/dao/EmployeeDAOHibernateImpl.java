package com.springboot.curddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.curddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub

		Session currentSession = entityManager.unwrap(Session.class);

		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

		List<Employee> theList = theQuery.getResultList();

		return theList;
	}

	@Override
	public Employee findById(int employeeId) {
		Session currentSession = entityManager.unwrap(Session.class);

		Employee employee = currentSession.get(Employee.class, employeeId);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(employee);

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

		Session currentSession = entityManager.unwrap(Session.class);

		Query theQuery = currentSession.createQuery("delete from Employee where id=:employeeID");

		theQuery.setParameter("employeeID", id);

		theQuery.executeUpdate();
	}

}
