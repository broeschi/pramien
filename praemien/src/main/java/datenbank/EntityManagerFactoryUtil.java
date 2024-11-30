package datenbank;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

    private static EntityManagerFactory emf;

    public static void setUp(String persistenceUnitName) {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("praemienPU");
        }
    }

//    public static EntityManagerFactory getEntityManagerFactory() {
//        return emf;
//    }

    public static void tearDown() {
        if (emf != null) {
            emf.close();
            emf = null;
        }
    }
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory() {
        try {
            return Persistence.createEntityManagerFactory("praemienPU");
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static void close() {
        entityManagerFactory.close();
    }
}