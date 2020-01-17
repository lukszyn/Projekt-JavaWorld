import java.util.Random;

public class Zaba extends Zwierze {

    private Pozycja pozycja;

    public Zaba() {

        this.inicjujParametry();
        Random random = new Random();
//        this.pozycja = new Pozycja(random.nextInt(getPlansza().getX()), random.nextInt(getPlansza().getY()));
        this.setPozycja(new Pozycja(10, 15));
    }


    public void jedz(Slimak slimak) {

        this.setSila(this.getSila() + slimak.getSila());
        super.jedz(slimak);

    }

    @Override
    public Zaba clone(){
        Zaba zaba = new Zaba();
        return zaba;
    }

    public void inicjujParametry() {
        this.setSila(20);
        this.setDlugoscZycia(16);
        this.setSilaDoRozmnazania(14);
        this.setIloscPotomstwa(2);
    }

}