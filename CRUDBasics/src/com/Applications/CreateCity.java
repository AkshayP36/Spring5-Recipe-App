package com.Applications;

import com.CRUD.Entity.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCity {
    //creating session factory
    //creating session
    //creating try finally block
    //writing store object methods into it
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                            addAnnotatedClass(City.class).
                                            buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{

            //creating city objects
            City city1= new City("Ahmednagar","In","Maharashtra","30");
            City city2= new City("Pune","In","Maharashtra","10");
            City city3= new City("Nashik","In","Maharashtra","15");
            City city4= new City("Nagpur","In","Maharashtra","5");

            //starting the transaction
            session.beginTransaction();

            //save the objects into database
            session.save(city1);
            session.save(city2);
            session.save(city3);
            session.save(city4);


            //commit the entries into database
            session.getTransaction().commit();

            System.out.println("Data stored into database sucessfully!");

        }catch (Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
    }
}
