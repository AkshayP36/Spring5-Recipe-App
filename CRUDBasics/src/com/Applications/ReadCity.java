package com.Applications;

import com.CRUD.Entity.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCity {
    //create session factory
    //create session
    //create try catch and block
    //write code to read the cities from the database
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().
                                            configure("hibernate.cfg.xml").
                                             addAnnotatedClass(City.class).
                                             buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{
            //get number from user, how many details they want to see
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number of data want to see : ");
            int capacity = scanner.nextInt();


            //start transaction
            session.beginTransaction();

            //get the database entries
            List<City> cityList = new ArrayList<>(capacity);
            for(int i=0;i<capacity;i++){
                cityList.add(session.get(City.class,i));
            }

            // print the fetched data
            for(int i=0;i<capacity;i++){
                System.out.println(i+" value = "+cityList.get(i));
            }


            //commit the session
            session.getTransaction().commit();

        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            session.close();
        }
    }
}
