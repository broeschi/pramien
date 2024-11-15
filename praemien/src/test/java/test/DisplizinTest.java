package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import stammdaten.Disziplin;

class DisziplinTest {

    @Test
    void testDisziplin() {
        Disziplin disziplin = new Disziplin();
        assertNotNull(disziplin);
        assertEquals(0, disziplin.getDisziplinId());
        assertNull(disziplin.getDisziplinName());
        assertNull(disziplin.getDisziplinAbk());
    }

    @Test
    void testDisziplinIntStringString() {
        int disziplinId = 1;
        String disziplinName = "Laufen";
        String disziplinAbk = "L";

        Disziplin disziplin = new Disziplin(disziplinId, disziplinName, disziplinAbk);

        assertEquals(disziplinId, disziplin.getDisziplinId());
        assertEquals(disziplinName, disziplin.getDisziplinName());
        assertEquals(disziplinAbk, disziplin.getDisziplinAbk());
    }

    @Test
    void testGetDisziplinId() {
        Disziplin disziplin = new Disziplin();
        disziplin.setDisziplinId(1);
        assertEquals(1, disziplin.getDisziplinId());
    }

    @Test
    void testSetDisziplinId() {
        Disziplin disziplin = new Disziplin();
        disziplin.setDisziplinId(2);
        assertEquals(2, disziplin.getDisziplinId());
    }

    @Test
    void testGetDisziplinName() {
        Disziplin disziplin = new Disziplin();
        disziplin.setDisziplinName("Schwimmen");
        assertEquals("Schwimmen", disziplin.getDisziplinName());
    }

    @Test
    void testSetDisziplinName() {
        Disziplin disziplin = new Disziplin();
        disziplin.setDisziplinName("Radfahren");
        assertEquals("Radfahren", disziplin.getDisziplinName());
    }

    @Test
    void testGetDisziplinAbk() {
        Disziplin disziplin = new Disziplin();
        disziplin.setDisziplinAbk("R");
        assertEquals("R", disziplin.getDisziplinAbk());
    }

    @Test
    void testSetDisziplinAbk() {
        Disziplin disziplin = new Disziplin();
        disziplin.setDisziplinAbk("S");
        assertEquals("S", disziplin.getDisziplinAbk());
    }
}
