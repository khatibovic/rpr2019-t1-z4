package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void testgetNaziv() {
        Artikl artikl = new Artikl();
        artikl.setNazivArtikla("Nesto");
        assertEquals(artikl.getNaziv(), "Nesto");
    }

    @Test
    void testgetKod() {
        Artikl artikl = new Artikl();
        artikl.setKod("1");
        assertEquals(artikl.getKod(), "1");
    }

    @Test
    void testgetCijena() {
        Artikl artikl = new Artikl();
        artikl.setCijena(10);
        assertTrue(artikl.getCijena()==10);
    }

    @Test
    void setNazivArtikla() {
        Artikl artikl = new Artikl();
        artikl.setNazivArtikla("Nesto");
        assertEquals(artikl.getNaziv(), "Nesto");
    }

    @Test
    void setCijena() {
        Artikl artikl = new Artikl();
        artikl.setKod("1");
        assertEquals(artikl.getKod(), "1");
    }

    @Test
    void setKod() {
        Artikl artikl = new Artikl();
        artikl.setCijena(10);
        assertTrue(artikl.getCijena()==10);
    }
}