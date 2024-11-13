package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import reglement.KilometerGeld;


public class KilometerGeldTest {

    @Test
    public void testKilometerGeldConstructorWithParameters() {
        int kmgId = 1;
        int kmgAnzahlFahrer = 2;
        double kmgFrankenProKm = 1.5;

        KilometerGeld kilometerGeld = new KilometerGeld(kmgId, kmgAnzahlFahrer, kmgFrankenProKm);

        assertEquals(kmgId, kilometerGeld.getKmgId());
        assertEquals(kmgAnzahlFahrer, kilometerGeld.getKmgAnzahlFahrer());
        assertEquals(kmgFrankenProKm, kilometerGeld.getKmgFrankenProKm());
    }

    @Test
    public void testKilometerGeldDefaultConstructor() {
        KilometerGeld kilometerGeld = new KilometerGeld();
        
        // Default values should be zero or as defined in the class if there are any defaults
        assertEquals(0, kilometerGeld.getKmgId());
        assertEquals(0, kilometerGeld.getKmgAnzahlFahrer());
        assertEquals(0.0, kilometerGeld.getKmgFrankenProKm(), 0.0001);
    }

    @Test
    public void testSettersAndGetters() {
        KilometerGeld kilometerGeld = new KilometerGeld();
        kilometerGeld.setKmgId(5);
        kilometerGeld.setKmgAnzahlFahrer(6);
        kilometerGeld.setKmgFrankenProKm(2.5);

        assertEquals(5, kilometerGeld.getKmgId());
        assertEquals(6, kilometerGeld.getKmgAnzahlFahrer());
        assertEquals(2.5, kilometerGeld.getKmgFrankenProKm(), 0.0001);
    }
}