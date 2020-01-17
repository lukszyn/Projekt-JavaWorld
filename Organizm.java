import java.util.Random;

public abstract class Organizm {

    private Plansza plansza;
    private Pozycja pozycja;
    private int sila;
    private int dlugoscZycia;
    private int silaDoRozmnazania;
    private int iloscPotomstwa;

    public Plansza getPlansza() {
        return plansza;
    }

    public void setPlansza(Plansza plansza) {
        this.plansza = plansza;
    }

    public Pozycja getPozycja() {
        return pozycja;
    }

    public void setPozycja(Pozycja pozycja) {
        this.pozycja = pozycja;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getIloscPotomstwa() {
        return iloscPotomstwa;
    }

    public void setIloscPotomstwa(int iloscPotomstwa) {
        this.iloscPotomstwa = iloscPotomstwa;
    }

    public int getDlugoscZycia() {
        return dlugoscZycia;
    }

    public void setDlugoscZycia(int dlugoscZycia) {
        this.dlugoscZycia = dlugoscZycia;
    }

    public int getSilaDoRozmnazania() {
        return silaDoRozmnazania;
    }

    public void setSilaDoRozmnazania(int silaDoRozmnazania) {
        this.silaDoRozmnazania = silaDoRozmnazania;
    }


}
