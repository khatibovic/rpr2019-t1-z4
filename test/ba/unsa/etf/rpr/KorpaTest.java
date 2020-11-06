package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {
    }

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("Nesto", 10, "123");
        boolean flag = korpa.dodajArtikl(artikl);
        assertTrue(flag);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("Nesto", 10, "123");
        korpa.dodajArtikl(artikl);
        assertEquals(10, korpa.dajUkupnuCijenuArtikala());
    }
}