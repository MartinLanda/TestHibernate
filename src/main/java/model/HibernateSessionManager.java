package model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * Created by Camunda on 11/11/2015.
 */
public class HibernateSessionManager {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            //return new Configuration().configure().buildSessionFactory();
            return new AnnotationConfiguration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        } catch (Throwable eThrowable) {
            System.err.println("Session factory creation failed: " + eThrowable);
            throw new ExceptionInInitializerError(eThrowable);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown(){
        getSessionFactory().close();
    }
}
