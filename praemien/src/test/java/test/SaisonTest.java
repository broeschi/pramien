package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import stammdaten.Saison;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class SaisonTest {

    @Test
    void testSaison() {
        Saison saison = new Saison();
        assertNotNull(saison);
        assertEquals(0, saison.getSaisonId());
        assertEquals(0, saison.getSaisnonJahr());
        assertNull(saison.getSaisonVon());
        assertNull(saison.getSaisonBis());
    }

    @Test
    void testSaisonIntIntDateFormatDateFormat() {
        int saisonId = 1;
        int saisonJahr = 2024;
        DateFormat saisonVon = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat saisonBis = new SimpleDateFormat("yyyy-MM-dd");
        Saison saison = new Saison(saisonId, saisonJahr, saisonVon, saisonBis);

        assertEquals(saisonId, saison.getSaisonId());
        assertEquals(saisonJahr, saison.getSaisnonJahr());
        assertEquals(((SimpleDateFormat) saisonVon).toPattern(), ((SimpleDateFormat) saison.getSaisonVon()).toPattern());
        assertEquals(((SimpleDateFormat) saisonBis).toPattern(), ((SimpleDateFormat) saison.getSaisonBis()).toPattern());
    }

    @Test
    void testGetSaisonId() {
        Saison saison = new Saison();
        saison.setSaisonId(1);
        assertEquals(1, saison.getSaisonId());
    }

    @Test
    void testSetSaisonId() {
        Saison saison = new Saison();
        saison.setSaisonId(2);
        assertEquals(2, saison.getSaisonId());
    }

    @Test
    void testGetSaisnonJahr() {
        Saison saison = new Saison();
        saison.setSaisnonJahr(2024);
        assertEquals(2024, saison.getSaisnonJahr());
    }

    @Test
    void testSetSaisnonJahr() {
        Saison saison = new Saison();
        saison.setSaisnonJahr(2025);
        assertEquals(2025, saison.getSaisnonJahr());
    }

    @Test
    void testGetSaisonVon() {
        DateFormat saisonVon = new SimpleDateFormat("yyyy-MM-dd");
        Saison saison = new Saison();
        saison.setSaisonVon(saisonVon);
        assertEquals(((SimpleDateFormat) saisonVon).toPattern(), ((SimpleDateFormat) saison.getSaisonVon()).toPattern());
    }

    @Test
    void testSetSaisonVon() {
        DateFormat saisonVon = new SimpleDateFormat("yyyy-MM-dd");
        Saison saison = new Saison();
        saison.setSaisonVon(saisonVon);
        assertEquals(((SimpleDateFormat) saisonVon).toPattern(), ((SimpleDateFormat) saison.getSaisonVon()).toPattern());
    }

    @Test
    void testGetSaisonBis() {
        DateFormat saisonBis = new SimpleDateFormat("yyyy-MM-dd");
        Saison saison = new Saison();
        saison.setSaisonBis(saisonBis);
        assertEquals(((SimpleDateFormat) saisonBis).toPattern(), ((SimpleDateFormat) saison.getSaisonBis()).toPattern());
    }

    @Test
    void testSetSaisonBis() {
        DateFormat saisonBis = new SimpleDateFormat("yyyy-MM-dd");
        Saison saison = new Saison();
        saison.setSaisonBis(saisonBis);
        assertEquals(((SimpleDateFormat) saisonBis).toPattern(), ((SimpleDateFormat) saison.getSaisonBis()).toPattern());
    }
}
