package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddMoreCoursesToViratDemo {

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

			//fetching a student into memory
			Student student = session.get(Student.class,2);

			//creating more courses
			Course course1= new Course("Machine Learning - real life problems");
			Course course2= new Course("My Grit");
			Course course3= new Course("Title goes no where");

			//adding student to courses
			course1.addStudent(student);
			course2.addStudent(student);
			course3.addStudent(student);

			//saving everything
			session.save(course1);
			session.save(course2);
			session.save(course3);


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
