package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import reglement.PunkteTabelle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PunkteTabelleTest {

    @Test
    public void testPunkteTabelleConstructorWithParameters() {
        int punktId = 1;
        int punktRennartId = 2;
        int punktRang = 3;
        int punktPunkte = 4;

        PunkteTabelle punktetabelle = new PunkteTabelle(punktId, punktRennartId, punktRang, punktPunkte);

        assertEquals(punktId, punktetabelle.getPunktId());
        assertEquals(punktRennartId, punktetabelle.getPunktRennartId());
        assertEquals(punktRang, punktetabelle.getPunktRang());
        assertEquals(punktPunkte, punktetabelle.getPunktPunkte());
    }

    @Test
    public void testPunkteTabelleDefaultConstructor() {
        PunkteTabelle punktetabelle = new PunkteTabelle();
        
        // Default values should be zero or as defined in the class if there are any defaults
        assertEquals(0, punktetabelle.getPunktId());
        assertEquals(0, punktetabelle.getPunktRennartId());
        assertEquals(0, punktetabelle.getPunktRang());
        assertEquals(0, punktetabelle.getPunktPunkte());
    }

    @Test
    public void testSettersAndGetters() {
        PunkteTabelle punktetabelle = new PunkteTabelle();
        punktetabelle.punktId = 5;
        punktetabelle.punktRennartId = 6;
        punktetabelle.punktRang = 7;
        punktetabelle.punktPunkte = 8;

        assertEquals(5, punktetabelle.getPunktId());
        assertEquals(6, punktetabelle.getPunktRennartId());
        assertEquals(7, punktetabelle.getPunktRang());
        assertEquals(8, punktetabelle.getPunktPunkte());
    }
}


