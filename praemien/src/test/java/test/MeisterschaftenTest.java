package test;



import org.junit.jupiter.api.Test;

import reglement.Meisterschaften;

import static org.junit.jupiter.api.Assertions.*;

public class MeisterschaftenTest {

    @Test
    public void testMeisterschaftenConstructorWithParameters() {
        int meisterId = 1;
        String meisterName = "Schweizermeisterschaft";
        String meisterAbk = "SM";

        Meisterschaften meisterschaften = new Meisterschaften(meisterId, meisterName, meisterAbk);

        assertEquals(meisterId, meisterschaften.getMeisterId());
        assertEquals(meisterName, meisterschaften.getMeisterName());
        assertEquals(meisterAbk, meisterschaften.getMeisterAbk());
    }

    @Test
    public void testMeisterschaftenDefaultConstructor() {
        Meisterschaften meisterschaften = new Meisterschaften();

        assertEquals(0, meisterschaften.getMeisterId());
        assertNull(meisterschaften.getMeisterName());
        assertNull(meisterschaften.getMeisterAbk());
    }

    @Test
    public void testSettersAndGetters() {
        Meisterschaften meisterschaften = new Meisterschaften();
        meisterschaften.setMeisterId(5);
        meisterschaften.setMeisterName("Champions League");
        meisterschaften.setMeisterAbk("CL");

        assertEquals(5, meisterschaften.getMeisterId());
        assertEquals("Champions League", meisterschaften.getMeisterName());
        assertEquals("CL", meisterschaften.getMeisterAbk());
    }
}
