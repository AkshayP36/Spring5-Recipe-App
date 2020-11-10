package com.CRUDApps;

import com.Entity.Teachers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateTeachers {
    //create a session factory
    //create a session
    //create try-catch and finally block to write code

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                            addAnnotatedClass(Teachers.class).
                                            buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{
            //build a instance of an object
            Teachers MarathiRock = new Teachers("Zingat","Marathi Rock","Singing");
            Teachers MarathiMelody = new Teachers("Man Udhan Varyache","Marathi Melody","Dancing");

            //begin transaction
            session.beginTransaction();

            //save the data into database
            session.save(MarathiMelody);
            session.save(MarathiRock);

            //commit the data into database
            session.getTransaction().commit();

            System.out.println("Data saved into database sucessfully!!");
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
