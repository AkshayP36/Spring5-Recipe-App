package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
				                .addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			

			// start a transaction
			session.beginTransaction();
			
			//get the instructor from database with the id = 2
			Instructor tempInstructor = session.get(Instructor.class,2);
			System.out.println("Data found on id=2 is : "+tempInstructor);

			//delete the instructor from database with fetched data
			if(tempInstructor != null){
				System.out.println("Deleting: "+tempInstructor);

				//Note : will also delete associated "details" object
				//because of CascadeType.ALL
				session.delete(tempInstructor);
			}

			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





