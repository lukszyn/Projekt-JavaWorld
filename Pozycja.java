public class Pozycja {

    private int x;
    private int y;

    public Pozycja(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void zmienPozycje(Kierunek kierunek) {

        switch (kierunek)
        {
            case UP:
                if (this.getY() == 0 || this.getY() == 100) {
                    System.out.println("Organizm jest na końcu planszy.");
                    break;
                } else {
                    System.out.println("Ruch w górę.");
                    this.setY(this.getY() + 1);
                    break;
                }
            case DOWN:
                if (this.getY() == 0 || this.getY() == 100) {
                    System.out.println("Organizm jest na końcu planszy.");
                    break;
                }
                else {
                    System.out.println("Ruch w dół.");
                    this.setY(this.getY() - 1);
                    break;
                }
            case LEFT:
                if (this.getX() == 0 || this.getX() == 100) {
                    System.out.println("Organizm jest na końcu planszy.");
                    break;
                } else {
                    System.out.println("Ruch w lewo.");
                    this.setX(this.getX() - 1);
                    break;
                }
            case RIGHT:
                if (this.getX() == 0 || this.getX() == 100) {
                    System.out.println("Organizm jest na końcu planszy.");
                    break;
                } else {
                    System.out.println("Ruch w prawo.");
                    this.setX(this.getX() + 1);
                    break;
                }
        }
    }

    @Override
    public String toString() {
        return "Pozycja{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
