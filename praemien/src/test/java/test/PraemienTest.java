package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import praemien.Praemien;

class PraemienTest {

    @Test
    void testPraemien() {
        Praemien praemien = new Praemien();
        assertNotNull(praemien);
        assertEquals(0, praemien.getPraemieId());
        assertEquals(0, praemien.getPraemienSaisonId());
        assertEquals(0, praemien.getPraemienEinzelRennenId());
        assertFalse(praemien.isPraemienHelfereinsatz());
        assertFalse(praemien.isPraemienEm());
        assertFalse(praemien.isPraemienWm());
        assertFalse(praemien.isPraemienOs());
        assertFalse(praemien.isPramienTsp());
        assertEquals(0, praemien.getPraemienEmBetrag());
        assertEquals(0, praemien.getPraemienWmBetrag());
        assertEquals(0, praemien.getPraemienOsBetrag());
        assertEquals(0, praemien.getPraemienTspBetrag());
        assertEquals(0, praemien.getPraemienLizenzbeitrag());
        assertEquals(0, praemien.getPramienTalentsichtung());
    }

    @Test
    void testPraemienIntIntIntBooleanBooleanBooleanBooleanBooleanIntIntIntIntIntInt() {
        int praemieId = 1;
        int praemienSaisonId = 2024;
        int praemienEinzelRennenId = 100;
        boolean praemienHelfereinsatz = false;
        boolean praemienEm = true;
        boolean praemienWm = false;
        boolean praemienOs = true;
        boolean praemienTsp = false;
        int praemienEmBetrag = 500;
        int praemienWmBetrag = 1000;
        int praemienOsBetrag = 1500;
        int praemienTspBetrag = 2000;
        int praemienLizenzbeitrag = 3000;
        int praemienTalentsichtung = 4000;

        Praemien praemien = new Praemien(praemieId, praemienSaisonId, praemienEinzelRennenId, praemienHelfereinsatz,
                praemienEm, praemienWm, praemienOs, praemienTsp, praemienEmBetrag, praemienWmBetrag, praemienOsBetrag,
                praemienTspBetrag, praemienLizenzbeitrag, praemienTalentsichtung);

        assertEquals(praemieId, praemien.getPraemieId());
        assertEquals(praemienSaisonId, praemien.getPraemienSaisonId());
        assertEquals(praemienEinzelRennenId, praemien.getPraemienEinzelRennenId());
        assertFalse(praemien.isPraemienHelfereinsatz());
        assertTrue(praemien.isPraemienEm());
        assertFalse(praemien.isPraemienWm());
        assertTrue(praemien.isPraemienOs());
        assertFalse(praemien.isPramienTsp());
        assertEquals(praemienEmBetrag, praemien.getPraemienEmBetrag());
        assertEquals(praemienWmBetrag, praemien.getPraemienWmBetrag());
        assertEquals(praemienOsBetrag, praemien.getPraemienOsBetrag());
        assertEquals(praemienTspBetrag, praemien.getPraemienTspBetrag());
        assertEquals(praemienLizenzbeitrag, praemien.getPraemienLizenzbeitrag());
        assertEquals(praemienTalentsichtung, praemien.getPramienTalentsichtung());
    }

    @Test
    void testGetPraemieId() {
        Praemien praemien = new Praemien();
        praemien.setPraemieId(1);
        assertEquals(1, praemien.getPraemieId());
    }

    @Test
    void testSetPraemieId() {
        Praemien praemien = new Praemien();
        praemien.setPraemieId(2);
        assertEquals(2, praemien.getPraemieId());
    }

    @Test
    void testGetPraemienSaisonId() {
        Praemien praemien = new Praemien();
        praemien.setPraemienSaisonId(2024);
        assertEquals(2024, praemien.getPraemienSaisonId());
    }

    @Test
    void testSetPraemienSaisonId() {
        Praemien praemien = new Praemien();
        praemien.setPraemienSaisonId(2025);
        assertEquals(2025, praemien.getPraemienSaisonId());
    }

    @Test
    void testGetPraemienEinzelRennenId() {
        Praemien praemien = new Praemien();
        praemien.setPraemienEinzelRennenId(100);
        assertEquals(100, praemien.getPraemienEinzelRennenId());
    }

    @Test
    void testSetPraemienEinzelRennenId() {
        Praemien praemien = new Praemien();
        praemien.setPraemienEinzelRennenId(101);
        assertEquals(101, praemien.getPraemienEinzelRennenId());
    }

    @Test
    void testIsPraemienHelfereinsatz() {
        Praemien praemien = new Praemien();
        praemien.setPraemienHelfereinsatz(true);
        assertTrue(praemien.isPraemienHelfereinsatz());
    }

    @Test
    void testSetPraemienHelfereinsatz() {
        Praemien praemien = new Praemien();
        praemien.setPraemienHelfereinsatz(false);
        assertFalse(praemien.isPraemienHelfereinsatz());
    }

    @Test
    void testIsPraemienEm() {
        Praemien praemien = new Praemien();
        praemien.setPraemienEm(true);
        assertTrue(praemien.isPraemienEm());
    }

    @Test
    void testSetPraemienEm() {
        Praemien praemien = new Praemien();
        praemien.setPraemienEm(false);
        assertFalse(praemien.isPraemienEm());
    }

    @Test
    void testIsPraemienWm() {
        Praemien praemien = new Praemien();
        praemien.setPraemienWm(true);
        assertTrue(praemien.isPraemienWm());
    }

    @Test
    void testSetPraemienWm() {
        Praemien praemien = new Praemien();
        praemien.setPraemienWm(false);
        assertFalse(praemien.isPraemienWm());
    }

    @Test
    void testIsPraemienOs() {
        Praemien praemien = new Praemien();
        praemien.setPraemienOs(true);
        assertTrue(praemien.isPraemienOs());
    }

    @Test
    void testSetPraemienOs() {
        Praemien praemien = new Praemien();
        praemien.setPraemienOs(false);
        assertFalse(praemien.isPraemienOs());
    }

    @Test
    void testIsPramienTsp() {
        Praemien praemien = new Praemien();
        praemien.setPramienTsp(true);
        assertTrue(praemien.isPramienTsp());
    }

    @Test
    void testSetPramienTsp() {
        Praemien praemien = new Praemien();
        praemien.setPramienTsp(false);
        assertFalse(praemien.isPramienTsp());
    }

    @Test
    void testGetPraemienEmBetrag() {
        Praemien praemien = new Praemien();
        praemien.setPraemienEmBetrag(500);
        assertEquals(500, praemien.getPraemienEmBetrag());
    }

    @Test
    void testSetPraemienEmBetrag() {
        Praemien praemien = new Praemien();
        praemien.setPraemienEmBetrag(600);
        assertEquals(600, praemien.getPraemienEmBetrag());
    }

    @Test
    void testGetPraemienWmBetrag() {
        Praemien praemien = new Praemien();
        praemien.setPraemienWmBetrag(700);
        assertEquals(700, praemien.getPraemienWmBetrag());
    }

    @Test
    void testGetPraemienOSBetrag() {
        Praemien praemien = new Praemien();
        praemien.setPraemienOsBetrag(800);
        assertEquals(800, praemien.getPraemienOsBetrag());
    }


}