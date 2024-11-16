package praemien;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programmstart {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("praemienPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Praemien praemien = new Praemien();
        praemien.setPraemienSaisonId(1);
        praemien.setPraemienEinzelRennenId(1);
        praemien.setPraemienHelfereinsatz(true);
        praemien.setPraemienEm(true);
        praemien.setPraemienWm(false);
        praemien.setPraemienOs(false);
        praemien.setPraemienTsp(true);
        praemien.setPraemienEmBetrag(100);
        praemien.setPraemienWmBetrag(200);
        praemien.setPraemienOsBetrag(300);
        praemien.setPraemienTspBetrag(400);
        praemien.setPraemienLizenzbeitrag(500);
        praemien.setPraemienTalentsichtung(600);

        em.persist(praemien);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
    
    
}