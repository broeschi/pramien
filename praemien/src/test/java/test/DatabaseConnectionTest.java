package test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DatabaseConnectionTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        try {
            emf = Persistence.createEntityManagerFactory("praemienPU");
            em = emf.createEntityManager();
            System.out.println("Database connection established successfully.");
        } catch (Exception e) {
            System.err.println("Failed to establish database connection: " + e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }
}
