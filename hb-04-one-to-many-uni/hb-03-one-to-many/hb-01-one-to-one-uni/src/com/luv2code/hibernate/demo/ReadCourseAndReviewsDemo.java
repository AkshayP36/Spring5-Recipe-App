package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ReadCourseAndReviewsDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
				                .addAnnotatedClass(InstructorDetail.class)
				                .addAnnotatedClass(Course.class)
				                .addAnnotatedClass(Review.class)
								.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {


			// start a transaction
			session.beginTransaction();

			//get a course
			Course course = session.get(Course.class,11);

			//get all reviews
			List<Review> review=course.getReviews();

			//Printing course and respective reviews
			System.out.println("Printing course name: "+course);
			System.out.println("Printing reviews received from customers:");
			for(int i=0;i<review.size();i++){
				System.out.println(i+" th customer reviews"+review.get(i));
			}


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
