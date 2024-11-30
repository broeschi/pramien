
package converter;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import datenbank.EntityManagerFactoryUtil;

public class TableCreator {

    private EntityManager entityManager;

    public TableCreator() {
        this.entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
    }

    public void createTable(String tableName, String createTableSQL) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            if (!isTableExists(tableName)) {
                entityManager.createNativeQuery(createTableSQL).executeUpdate();
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }

    private boolean isTableExists(String tableName) {
        try {
            entityManager.createNativeQuery("SELECT 1 FROM " + tableName + " LIMIT 1").getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
