package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Instructor;
import com.entity.InstructorDetails;
import com.entity.Student;

public class CreateCourseAndStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class).addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			

			Course course= new Course("JAva beginne to Pro");
			
			session.save(course);
			
			System.out.println("Course saved");
			
			Student studentOne= new Student("FirstName","LastName","saiftak1@gmail.com");
			Student studentTwo= new Student("SecondName","LastName","saiftak2@gmail.com");
			
			course.add(studentOne);
			course.add(studentTwo);
			
			
			session.save(studentOne);
			session.save(studentTwo); 

			System.out.println("Student saved");
			
			session.getTransaction().commit();

			System.out.println("Done ...!!");
			
		}finally {
			session.close();
			factory.close();
		}
	}
}
