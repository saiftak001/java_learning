package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Instructor;
import com.entity.InstructorDetails;

public class CreateCourseDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			 
			int instructorID=1;
			
			session.beginTransaction();
			
			Instructor tempInstructor= session.get(Instructor.class, instructorID);
			
			/*
			 * Course courseOne= new Course("Java Developer Course"); Course courseTwo= new
			 * Course("Python Developer Course");
			 * 
			 * tempInstructor.add(courseOne); tempInstructor.add(courseTwo);
			 * 
			 * session.save(courseOne); session.save(courseTwo);
			 */
			
			System.out.println("Read data ...");
//			System.out.println(tempInstructor.getCourse());
			
			System.out.println("delete only course...");
			
			int courseID=10;
			
			Course theCourse=session.get(Course.class, courseID);
			
			session.delete(theCourse);
			
			session.getTransaction().commit();

			System.out.println("Done ...!!");
			
		}finally {
			session.close();
			factory.close();
		}
	}
}
