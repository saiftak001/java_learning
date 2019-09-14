package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Instructor;
import com.entity.InstructorDetails;
import com.entity.Reviews;

public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class).addAnnotatedClass(Reviews.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			
			Course theCourse= new Course("Learn Java 8 from scratch");
			
			theCourse.addReview(new Reviews("This course is awesome"));
			theCourse.addReview(new Reviews("This course should be more detailed"));
			theCourse.addReview(new Reviews("This course is okiesh"));			
			
			
			
			System.out.println("Save the Course");
			
			session.save(theCourse);
			
			session.getTransaction().commit();

			System.out.println("Done ...!!");
			
		}finally {
			session.close();
			factory.close();
		}
	}
}
