package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Instructor;
import com.entity.InstructorDetails;

public class EagerLazyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			 
			int instructorID=1;
			
			session.beginTransaction();
			
			Instructor tempInstructor= session.get(Instructor.class, instructorID);
			
			System.out.println("The instructor is : "+tempInstructor);
			System.out.println("The course details are : "+tempInstructor.getCourse());
			
			session.getTransaction().commit();

			System.out.println("Done ...!!");
			
		}finally {
			session.close();
			factory.close();
		}
	}
}
