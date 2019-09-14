package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class CreateStrudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			System.out.println("Save data to database");
			/*
			 * System.out.println("Creating student object ..."); Student tempStudent = new
			 * Student("FirstName", "LastName", "saiftak001@gmail.com");
			 * 
			 * session.beginTransaction();
			 * 
			 * System.out.println("Save the student ..."); session.save(tempStudent);
			 * 
			 * session.getTransaction().commit();
			 *
			 * System.out.println("Done!	");
			 */

			System.out.println("Read data from database...!");
			/*
			 * session = factory.getCurrentSession(); session.beginTransaction();
			 * 
			 * Student myStudent= session.get(Student.class,tempStudent.getId());
			 * 
			 * System.out.println(myStudent);
			 *
			 *
			 * List<Student> theStudent =
			 * session.createQuery("from Student s where s.firstName ='FourthName'").list();
			 * 
			 * for (Student student : theStudent) { System.out.println("Student value is " +
			 * student); }
			 */

			System.out.println("update data to database");

			/*
			 * session.beginTransaction();
			 * 
			 * int theStudent=2;
			 * 
			 * Student student= session.get(Student.class, theStudent);
			 * 
			 * student.setEmail("saiftak0002@gmail.com");
			 * 
			 * List<Student> studentList=
			 * session.createQuery("from Student").getResultList();
			 * for(Student getStudent:studentList) { System.out.println(getStudent); }
			 * session.getTransaction().commit();
			 */

			System.out.println("Delete data from database");
			/*
			 * int theStudent = 1;
			 * 
			 * Student student = session.get(Student.class, theStudent);
			 * 
			 * session.delete(student);
			 * 
			 * List<Student>
			 * studentList=session.createQuery("from Student s").getResultList();
			 * 
			 * for(Student getStudent:studentList) { System.out.println(getStudent); }
			 */

			// session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}
}
