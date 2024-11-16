
package praemien;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class RetrievePraemien {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("praemienPU");
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Praemien> query = em.createQuery("SELECT p FROM Praemien p", Praemien.class);
            List<Praemien> praemienList = query.getResultList();

            for (Praemien praemien : praemienList) {
                System.out.println(praemien);
            }
        } finally {
            em.close();
            emf.close();
        }
    }
}
