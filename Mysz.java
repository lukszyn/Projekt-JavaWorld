import java.util.Random;

public class Mysz extends Zwierze {

    public Mysz() {

        this.inicjujParametry();
        Random random = new Random();
//        this.pozycja = new Pozycja(random.nextInt(getPlansza().getX()-1), random.nextInt(getPlansza().getY()-1));
        this.setPozycja(new Pozycja(10, 15));
    }


    public void jedz(Zaba zaba) {

        this.setSila(this.getSila() + zaba.getSila());
        super.jedz(zaba);

    }

    @Override
    public Mysz clone(){
        Mysz mysz = new Mysz();
        return mysz;
    }

    public void inicjujParametry() {
        this.setSila(20);
        this.setDlugoscZycia(16);
        this.setSilaDoRozmnazania(14);
        this.setIloscPotomstwa(2);
    }

}