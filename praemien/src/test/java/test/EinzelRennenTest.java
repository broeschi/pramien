package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import praemien.EinzelRennen;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class EinzelRennenTest {

    @Test
    void testEinzelrennen() {
        EinzelRennen einzelRennen = new EinzelRennen();
        assertNotNull(einzelRennen);
        assertEquals(0, einzelRennen.getEinzelRennenId());
        assertNull(einzelRennen.getEinzelRennenRennDatum());
        assertNull(einzelRennen.getEinzelRennenName());
        assertEquals(0, einzelRennen.getEinzelRennenDisziplinId());
        assertEquals(0, einzelRennen.getEinzelRennenSaisonId());
        assertEquals(0, einzelRennen.getEinzelRennenPersonId());
        assertEquals(0, einzelRennen.getEinzelRennenRennArtId());
        assertEquals(0, einzelRennen.getEinzelRennenRang());
        assertNull(einzelRennen.getEinzelRennenLink());
        assertEquals(0, einzelRennen.getEinzelRennenPunkte());
    }

    @Test
    void testEinzelrennenIntDateFormatStringIntIntIntIntIntStringInt() {
        int einzelRennenId = 1;
        DateFormat rennDatum = new SimpleDateFormat("yyyy-MM-dd");
        String rennenName = "Stadtlauf";
        int disziplinId = 101;
        int saisonId = 2024;
        int personId = 50;
        int rennArtId = 5;
        int rang = 1;
        String link = "https://example.com/race";
        int punkte = 10;

        EinzelRennen einzelRennen = new EinzelRennen(einzelRennenId, rennDatum, rennenName, disziplinId, saisonId, personId, rennArtId, rang, link, punkte);

        assertEquals(einzelRennenId, einzelRennen.getEinzelRennenId());
        assertEquals(rennDatum, einzelRennen.getEinzelRennenRennDatum());
        assertEquals(rennenName, einzelRennen.getEinzelRennenName());
        assertEquals(disziplinId, einzelRennen.getEinzelRennenDisziplinId());
        assertEquals(saisonId, einzelRennen.getEinzelRennenSaisonId());
        assertEquals(personId, einzelRennen.getEinzelRennenPersonId());
        assertEquals(rennArtId, einzelRennen.getEinzelRennenRennArtId());
        assertEquals(rang, einzelRennen.getEinzelRennenRang());
        assertEquals(link, einzelRennen.getEinzelRennenLink());
        assertEquals(punkte, einzelRennen.getEinzelRennenPunkte());
    }

    @Test
    void testGetEinzelRennenId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenId(1);
        assertEquals(1, einzelRennen.getEinzelRennenId());
    }

    @Test
    void testSetEinzelRennenId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenId(2);
        assertEquals(2, einzelRennen.getEinzelRennenId());
    }

    @Test
    void testGetEinzelRennenRennDatum() {
        DateFormat rennDatum = new SimpleDateFormat("yyyy-MM-dd");
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenRennDatum(rennDatum);
        assertEquals(rennDatum, einzelRennen.getEinzelRennenRennDatum());
    }

    @Test
    void testSetEinzelRennenRennDatum() {
        DateFormat rennDatum = new SimpleDateFormat("yyyy-MM-dd");
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenRennDatum(rennDatum);
        assertEquals(rennDatum, einzelRennen.getEinzelRennenRennDatum());
    }

    @Test
    void testGetEinzelRennenName() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenName("City Marathon");
        assertEquals("City Marathon", einzelRennen.getEinzelRennenName());
    }

    @Test
    void testSetEinzelRennenName() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenName("City Marathon");
        assertEquals("City Marathon", einzelRennen.getEinzelRennenName());
    }

    @Test
    void testGetEinzelRennenDisziplinId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenDisziplinId(101);
        assertEquals(101, einzelRennen.getEinzelRennenDisziplinId());
    }

    @Test
    void testSetEinzelRennenDisziplinId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenDisziplinId(102);
        assertEquals(102, einzelRennen.getEinzelRennenDisziplinId());
    }

    @Test
    void testGetEinzelRennenSaisonId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenSaisonId(2024);
        assertEquals(2024, einzelRennen.getEinzelRennenSaisonId());
    }

    @Test
    void testSetEinzelRennenSaisonId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenSaisonId(2025);
        assertEquals(2025, einzelRennen.getEinzelRennenSaisonId());
    }

    @Test
    void testGetEinzelRennenPersonId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenPersonId(50);
        assertEquals(50, einzelRennen.getEinzelRennenPersonId());
    }

    @Test
    void testSetEinzelRennenPersonId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenPersonId(51);
        assertEquals(51, einzelRennen.getEinzelRennenPersonId());
    }

    @Test
    void testGetEinzelRennenRennArtId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenRennArtId(5);
        assertEquals(5, einzelRennen.getEinzelRennenRennArtId());
    }

    @Test
    void testSetEinzelRennenRennArtId() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenRennArtId(6);
        assertEquals(6, einzelRennen.getEinzelRennenRennArtId());
    }

    @Test
    void testGetEinzelRennenRang() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenRang(1);
        assertEquals(1, einzelRennen.getEinzelRennenRang());
    }

    @Test
    void testSetEinzelRennenRang() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenRang(2);
        assertEquals(2, einzelRennen.getEinzelRennenRang());
    }

    @Test
    void testGetEinzelRennenLink() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenLink("https://example.com");
        assertEquals("https://example.com", einzelRennen.getEinzelRennenLink());
    }

    @Test
    void testSetEinzelRennenLink() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenLink("https://example.com");
        assertEquals("https://example.com", einzelRennen.getEinzelRennenLink());
    }

    @Test
    void testGetEinzelRennenPunkte() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenPunkte(10);
        assertEquals(10, einzelRennen.getEinzelRennenPunkte());
    }

    @Test
    void testSetEinzelRennenPunkte() {
        EinzelRennen einzelRennen = new EinzelRennen();
        einzelRennen.setEinzelRennenPunkte(15);
        assertEquals(15, einzelRennen.getEinzelRennenPunkte());
    }
}
