
package converter;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import person.Adresse;
import person.Person;
import datenbank.EntityManagerFactoryUtil;


public class AdresseConverter {

    private EntityManager entityManager;

    public AdresseConverter() {
        this.entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
    }

    public void saveAdresse(Adresse adresse, Person person) {
        adresse.setPerson(person); // Set the person object
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(adresse);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }

    public Adresse getAdresse(int adresseId) {
        TypedQuery<Adresse> query = entityManager.createQuery("SELECT a FROM Adresse a WHERE a.adresseId = :adresseId", Adresse.class);
        query.setParameter("adresseId", adresseId);
        return query.getSingleResult();
    }
}