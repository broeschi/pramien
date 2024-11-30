
// File: src/test/java/test/PraemienConverterSchreibenTest.java
package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import converter.PraemienConverterSchreiben;
import datenbank.EntityManagerFactoryUtil;
import praemien.Praemien;

public class PraemienConverterSchreibenTest {

    private static EntityManagerFactory emf;
    private EntityManager em;

    @BeforeAll
    public static void setUpClass() {
        EntityManagerFactoryUtil.setUp("praemienPU");
        emf = EntityManagerFactoryUtil.getEntityManagerFactory();
    }

    @AfterAll
    public static void tearDownClass() {
        EntityManagerFactoryUtil.tearDown();
    }

    @BeforeEach
    public void setUp() {
        em = emf.createEntityManager();
    }

    @AfterEach
    public void tearDown() {
        if (em != null) {
            em.close();
        }
    }

    @Test
    public void testConvertPraemien() {
        PraemienConverterSchreiben converter = new PraemienConverterSchreiben();
        converter.convertPraemien();

        Praemien praemien = em.find(Praemien.class, 1);
        assertNotNull(praemien);
    }
}
