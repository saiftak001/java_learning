package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Instructor;
import com.entity.InstructorDetails;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			int studentID=2;
			
			/*
			 * Instructor tempInstructor = new Instructor("Fourth Name", "Last Name",
			 * "saiftak4@gmail.com");
			 * 
			 * InstructorDetails tempInstructorDetails = new
			 * InstructorDetails("hhtps://www.luv5code.com/youtube", "Luv 5 code");
			 * 
			 * tempInstructor.setInstructor_detail_id(tempInstructorDetails);
			 */
			 

			session.beginTransaction();

			/*
			 * System.out.println("This will also save the details object, because of casade.ALL.");
			 * System.out.println("Saving instructor :" + tempInstructor);
			 * session.save(tempInstructor);
			 */
			 
			
			System.out.println("Delete data from OneToOne Mapping");
			/*
			 * Instructor theInstructor= session.get(Instructor.class, studentID);
			 * 
			 * session.delete(theInstructor);
			 */
			System.out.println("");
			
			System.out.println("Delete only Instructor detail and not instructor");
			
			Instructor tempInstructorDetail = session.get(Instructor.class, studentID);
//			tempInstructorDetail.getInstructor_detail_id().setInstructor(null);
			
			session.delete(tempInstructorDetail);
			
			session.getTransaction().commit();

			System.out.println("Done ...!!");
			System.out.println("Done for the day");

		}catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		
		
		finally {
			session.close();
			factory.close();
		}
	}
}
