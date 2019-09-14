package com.hibernate.demo.copy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Instructor;
import com.entity.InstructorDetails;

public class CreateInstructorBiDirectionalDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			int studentID = 2;
			session.beginTransaction();

			InstructorDetails details = session.get(InstructorDetails.class, studentID);

			System.out.println("instructor details " + details);
			System.out.println("instructor " + details.getInstructor());

			session.getTransaction().commit();

			System.out.println("Done ...!!");

		} finally {
			session.close();
			factory.close();
		}
	}
}
