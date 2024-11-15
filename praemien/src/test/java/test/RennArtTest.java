package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import stammdaten.RennArt;

class RennArtTest {

    @Test
    void testRennArt() {
        RennArt rennArt = new RennArt();
        assertNotNull(rennArt);
        assertEquals(0, rennArt.getRennArtId());
        assertNull(rennArt.getRennArtName());
    }

    @Test
    void testRennArtIntString() {
        int rennArtId = 1;
        String rennArtName = "Sprint";

        RennArt rennArt = new RennArt(rennArtId, rennArtName);

        assertEquals(rennArtId, rennArt.getRennArtId());
        assertEquals(rennArtName, rennArt.getRennArtName());
    }

    @Test
    void testGetRennArtId() {
        RennArt rennArt = new RennArt();
        rennArt.setRennArtId(2);
        assertEquals(2, rennArt.getRennArtId());
    }

    @Test
    void testSetRennArtId() {
        RennArt rennArt = new RennArt();
        rennArt.setRennArtId(3);
        assertEquals(3, rennArt.getRennArtId());
    }

    @Test
    void testGetRennArtName() {
        RennArt rennArt = new RennArt();
        rennArt.setRennArtName("Marathon");
        assertEquals("Marathon", rennArt.getRennArtName());
    }

    @Test
    void testSetRennArtName() {
        RennArt rennArt = new RennArt();
        rennArt.setRennArtName("Hürdenlauf");
        assertEquals("Hürdenlauf", rennArt.getRennArtName());
    }
}
