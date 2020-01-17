import java.util.Random;

public class Lis extends Zwierze {

    private Pozycja pozycja;

    public Lis() {

        this.inicjujParametry();
        Random random = new Random();
//        this.pozycja = new Pozycja(random.nextInt(getPlansza().getX()), random.nextInt(getPlansza().getY()));
        this.setPozycja(new Pozycja(10, 15));
    }


    public void jedz(Mysz mysz) {

        this.setSila(this.getSila() + mysz.getSila());
        super.jedz(mysz);

    }

    @Override
    public Lis clone(){
        Lis lis = new Lis();
        return lis;
    }

    public void inicjujParametry() {
        this.setSila(20);
        this.setDlugoscZycia(16);
        this.setSilaDoRozmnazania(14);
        this.setIloscPotomstwa(2);
    }

}

