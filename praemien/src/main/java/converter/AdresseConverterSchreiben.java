
// File: src/main/java/converter/AdressConverterSchreiben.java
package converter;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import datenbank.EntityManagerFactoryUtil;
import person.Adresse;

public class AdresseConverterSchreiben {

    public void convertAdress() {
        EntityManager em = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        person.Adresse adresse = new Adresse();
        adresse.setAdresseId(1);
        adresse.setAdresseStrasse("Musterstrasse");
        adresse.setAdresseNummer(99);
        adresse.setAdressePlz(9033);
        adresse.setAdresseOrt("Altenrhein");
        adresse.setGueltigAb(LocalDate.now());
        em.persist(adresse);

        em.getTransaction().commit();
        em.close();
    }
}
