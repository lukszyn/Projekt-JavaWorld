import java.util.*;

public class Main {

    public static void main(String[] argrs) {

        Plansza plansza= new Plansza(100, 100);
        int iloscTur = 1000;

        for(int i = 0; i <3; i++) {
            plansza.dodajLosowyOrganizm(LosowyOrganizm.getRandomElement());
        }


        for(int i = 0; i < iloscTur; i++) {

            plansza.inicjujTure();
            plansza.toString();

        }
    }

}

