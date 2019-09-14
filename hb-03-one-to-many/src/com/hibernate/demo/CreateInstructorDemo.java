package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Instructor;
import com.entity.InstructorDetails;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			
			
			  Instructor tempInstructor = new Instructor("Sixth Name", "Last Name",
			  "saiftak6@gmail.com");
			  
			  InstructorDetails tempInstructorDetails = new
			  InstructorDetails("hhtps://www.luv7code.com/youtube", "Luv 7 code");
			  
			  tempInstructor.setInstructor_detail_id(tempInstructorDetails);
			 
			 

			session.beginTransaction();
			
			session.save(tempInstructor);
						
			session.getTransaction().commit();

			System.out.println("Done ...!!");
			
		}finally {
			session.close();
			factory.close();
		}
	}
}
