package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetCoursesToViratDemo {

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

			//get student Virat
			Student student = session.get(Student.class,2);

			//print courses of Virat
			System.out.println("Virat's courses: "+student.getCourses());

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
