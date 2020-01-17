import java.util.*;

public class Plansza {

    private int x;
    private int y;
    //    private ArrayList<ArrayList<Organizm>> organizmy = new ArrayList<ArrayList<Organizm>>();
    private ArrayList<Organizm> organizmy;
    private int tura = 0;

    public Plansza(int x, int y) {
        this.x = x;
        this.y = y;
        this.organizmy = new ArrayList<Organizm>();
    }

    public void inicjujTure() {
        for (Organizm organizm : organizmy) {
            if (organizm instanceof Zwierze) {
                organizm.getPozycja().zmienPozycje(Kierunek.getRandomKierunek());
            } else {
                continue;
            }
        }
    }

    public ArrayList<Organizm> getOrganizmy() {
        return organizmy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTura() {
        return tura;
    }

    public void dodajOrganizm(Organizm organizm) {
        organizmy.add(organizm);
    }

    public void usunOrganizm(Organizm organizm) {
        organizmy.remove(organizm);
    }

    public void dodajLosowyOrganizm(LosowyOrganizm losowyOrganizm) {
        switch (losowyOrganizm) {
            case L:
                getOrganizmy().add(new Lis());
                break;

            case M:
                getOrganizmy().add(new Mysz());
                break;

            case Z:
                getOrganizmy().add(new Zaba());
                break;

            case S:
                Organizm s = new Slimak();
                getOrganizmy().add(s);
                break;

//            case G:
//                this.organizmy.add(new Grzyb(this));
//                break;
//
//            case C:
//                this.organizmy.add(new Lisc(this));
//                break;

        }
    }

}

