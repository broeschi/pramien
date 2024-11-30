
package converter;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import person.Person;
import datenbank.EntityManagerFactoryUtil;

public class PersonConverter {

	private EntityManager entityManager;

	public PersonConverter() {
		this.entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
	}

	public void savePerson(Person person) {
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(person);
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
			throw e;
		}
	}

	public Person getPerson(int personId) {
		TypedQuery<Person> query = entityManager.createQuery("SELECT p FROM Person p WHERE p.personId = :personId",
				Person.class);
		query.setParameter("personId", personId);
		return query.getSingleResult();
	}



}
