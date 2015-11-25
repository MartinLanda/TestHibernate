package model;

import org.hibernate.Session;

import java.util.Date;

/**
 * Created by Camunda on 11/11/2015.
 */
public class Main {

    public static void main(String[] args){
        Session session = HibernateSessionManager.getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();
       // user.setUserId(9);
        user.setUserName("Sofi");
        user.setCreatedBy("App");
        user.setCreatedDate(new Date());

        session.save(user);
        session.getTransaction().commit();
    }
}
