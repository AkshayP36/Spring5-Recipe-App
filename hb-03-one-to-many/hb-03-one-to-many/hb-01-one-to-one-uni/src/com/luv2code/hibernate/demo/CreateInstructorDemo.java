package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {

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
			//create object instances

			Instructor tempInstructor =
					new Instructor("Virat","Captain on rocks","myCaptain@gmail.com");
			InstructorDetail tempInstructorDetail =
					new InstructorDetail("http://youtube.com/","World class Batsman");


             /*

            Instructor tempInstructor =
                    new Instructor("Rohit","VCaptain","myVCaptaion@icc.com");
            InstructorDetail tempInstructorDetail =
                    new InstructorDetail("http://youtube.com/","Batsman");


              */


			//associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);

			// start a transaction
			session.beginTransaction();

			// save the object
			//Note : this will also save the details object
			//because of CascadeType.ALL
			session.save(tempInstructor);

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





