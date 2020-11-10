package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchJoinDemo {

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
			int tempid=1;
			Query<Instructor> query=
					session.createQuery("select i from Instructor i"
							                +" JOIN FETCH i.courses"
							                +" where i.id=: theInstructorId",Instructor.class);

			query.setParameter("theInstructorId",tempid);
			Instructor tempInstructor = query.getSingleResult();
			System.out.println("Instructor = "+tempInstructor);

			//get all courses of the instructor
			System.out.println("\n\nAll courses available from the instructor: "+tempInstructor.getCourses());



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





