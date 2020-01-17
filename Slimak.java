import java.util.Random;

public class Slimak extends Zwierze {

    private Pozycja pozycja;

    public Slimak() {

        this.inicjujParametry();
        Random random = new Random();
//        this.pozycja = new Pozycja(random.nextInt(getPlansza().getX()), random.nextInt(getPlansza().getY()));
        this.setPozycja(new Pozycja(10, 15));
    }


    public void jedz(Lisc lisc) {

        this.setSila(this.getSila() + lisc.getSila());
        super.jedz(lisc);

    }

    @Override
    public Slimak clone(){
        Slimak slimak = new Slimak();
        return slimak;
    }

    public void inicjujParametry() {
        this.setSila(5);
        this.setDlugoscZycia(10);
        this.setSilaDoRozmnazania(3);
        this.setIloscPotomstwa(8);
    }

}