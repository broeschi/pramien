
// File: src/main/java/converter/PraemienConverterSchreiben.java
package converter;

import javax.persistence.EntityManager;
import datenbank.EntityManagerFactoryUtil;
import praemien.Praemien;

public class PraemienConverterSchreiben {

    public void convertPraemien() {
        EntityManager em = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
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
    }
}
