package ba.unsa.etf.rpr;

public class Artikl {
    String NazivArtikla;
    int Cijena;
    String Kod;
    Artikl()
    {
        NazivArtikla="";
        Cijena=0;
        Kod="";
    }
    Artikl(String na,int c,String k)
    {
        NazivArtikla=na;
        Cijena=c;
        Kod=k;
    }
    public String getNaziv() {
        return this.NazivArtikla;
    }

    public String getKod() {
        return this.Kod;
    }

    public int getCijena() {
        return  this.Cijena;
    }

    public void setNazivArtikla(String nazivArtikla) {
        NazivArtikla = nazivArtikla;
    }

    public void setCijena(int cijena) {
        Cijena = cijena;
    }

    public void setKod(String kod) {
        Kod = kod;
    }
}


