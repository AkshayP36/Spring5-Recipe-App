package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteJavaCourseDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
				                .addAnnotatedClass(InstructorDetail.class)
				                .addAnnotatedClass(Course.class)
				                .addAnnotatedClass(Review.class)
				                .addAnnotatedClass(Student.class)
								.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {


			// start a transaction
			session.beginTransaction();

			//get Java course into memory
			Course course=session.get(Course.class,10);

			//delete Java course
			session.delete(course);

			// commit transaction
			session.getTransaction().commit();


			System.out.println("Done!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {

			//clean up code
			session.close();
			factory.close();
		}
	}

}
