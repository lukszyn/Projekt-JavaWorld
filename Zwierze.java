import java.util.ArrayList;

public abstract class Zwierze extends Organizm {

    private ArrayList<Pozycja> odwiedzonePozycje;

    public void zapiszPozycje(Pozycja pozycja) {
        odwiedzonePozycje.add(pozycja);
    }

    public void jedz(Organizm organizm) {

        super.getPlansza().usunOrganizm(organizm);

    }

}
