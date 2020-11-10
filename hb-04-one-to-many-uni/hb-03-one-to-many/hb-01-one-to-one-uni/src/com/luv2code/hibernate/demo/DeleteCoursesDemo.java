package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCoursesDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
				                .addAnnotatedClass(InstructorDetail.class)
				                .addAnnotatedClass(Course.class)
								.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {


			// start a transaction
			session.beginTransaction();

			//get a course from the database
			Course tempCourse = session.get(Course.class,15);
			
			//delete the retrieved course from the database
			session.delete(tempCourse);

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





