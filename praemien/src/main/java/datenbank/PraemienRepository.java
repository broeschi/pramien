   package datenbank;

   import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import praemien.Praemien;

   public class PraemienRepository {

       private EntityManagerFactory emf = Persistence.createEntityManagerFactory("your-persistence-unit");

       public void save(Praemien praemien) {
           EntityManager em = emf.createEntityManager();
           em.getTransaction().begin();
           em.persist(praemien);
           em.getTransaction().commit();
           em.close();
       }

       public Praemien findById(int id) {
           EntityManager em = emf.createEntityManager();
           Praemien praemien = em.find(Praemien.class, id);
           em.close();
           return praemien;
       }

       public List<Praemien> findAll() {
           EntityManager em = emf.createEntityManager();
           List<Praemien> praemienList = em.createQuery("SELECT p FROM Praemien p", Praemien.class).getResultList();
           em.close();
           return praemienList;
       }

       public void delete(Praemien praemien) {
           EntityManager em = emf.createEntityManager();
           em.getTransaction().begin();
           em.remove(em.contains(praemien) ? praemien : em.merge(praemien));
           em.getTransaction().commit();
           em.close();
       }
   }
