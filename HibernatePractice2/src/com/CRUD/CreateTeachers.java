package com.CRUD;

import com.CRUD.Entity.Teachers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateTeachers {
    public static void main(String[] args) {
        //creating session factory
        SessionFactory sessionFactory = new Configuration()
                                        .configure("hibernate.cfg.xml")
                                        .addAnnotatedClass(Teachers.class)
                                        .buildSessionFactory();

        //creating session
        Session session = sessionFactory.getCurrentSession();


        //under try-catch block all db write code
        try{

            //create a teacher object instance
            System.out.println("Creating a teacher instance to store into database");
            Teachers tech1 = new Teachers("abcd","xyz","Maths");
            Teachers tech2 = new Teachers("abce","ujsk","Science");

            //start transaction with database
            session.beginTransaction();

            //save to db
            System.out.println("saving teachers data into database");
           // session.save(tech1);
            session.save(tech2);


            //commit to db
            session.getTransaction().commit();
            System.out.println("Data updated to database");
        }
        finally {
            session.close();
        }
    }
}
