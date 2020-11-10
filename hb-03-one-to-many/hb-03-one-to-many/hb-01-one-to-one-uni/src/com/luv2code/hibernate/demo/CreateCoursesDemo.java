package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCoursesDemo {

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


			//get instructor from database
			int tempid=3;
			Instructor tempInstructor = session.get(Instructor.class, tempid);

			//create courses
			Course course1 = new Course("ML class with basics");
			Course course2 = new Course("ML classes Python");
			Course course3 = new Course("ML classes with Algorithms");


			//add courses to the instructor
			tempInstructor.add(course1);
			tempInstructor.add(course2);
			tempInstructor.add(course3);

			//save it to the database
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





