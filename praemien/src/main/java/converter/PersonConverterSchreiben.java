
package converter;

import javax.persistence.EntityManager;
import datenbank.EntityManagerFactoryUtil;
import person.Person;

public class PersonConverterSchreiben {

    public void convertPerson() {
        EntityManager em = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        Person person = new Person();
        // Set the properties of the Person entity
        person.setPersonVorname("John");
        person.setPersonName("Doe");
        person.setPersonJahrgang(1980);
        person.setPersonLizenz(1234);

        em.persist(person);

        em.getTransaction().commit();
        em.close();
    }
}
