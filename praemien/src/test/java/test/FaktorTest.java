package test;



import org.junit.jupiter.api.Test;

import reglement.Faktor;

import static org.junit.jupiter.api.Assertions.*;

public class FaktorTest extends Faktor {

    @Test
    public void testFaktorConstructorWithParameters() {
        int faktorId = 1;
        int faktorKatId = 2;
        double faktorFaktor = 1.5;

        Faktor faktor = new Faktor(faktorId, faktorKatId, faktorFaktor);

        assertEquals(faktorId, faktor.getFaktorId());
        assertEquals(faktorKatId, faktor.getFaktorKatId());
        assertEquals(faktorFaktor, faktor.getFaktorFaktor());
    }

    @Test
    public void testFaktorDefaultConstructor() {
        Faktor faktor = new Faktor();
        
        // Default values should be zero or as defined in the class if there are any defaults
        assertEquals(0, faktor.getFaktorId());
        assertEquals(0, faktor.getFaktorKatId());
        assertEquals(0.0, faktor.getFaktorFaktor(), 0.0001);
    }

    @Test
    public void testSettersAndGetters() {
        Faktor faktor = new Faktor();
        faktor.setFaktorId(5);
        faktor.setFaktorKatId(6);
        faktor.setFaktorFaktor(2.5);

        assertEquals(5, faktor.getFaktorId());
        assertEquals(6, faktor.getFaktorKatId());
        assertEquals(2.5, faktor.getFaktorFaktor(), 0.0001);
    }
}

