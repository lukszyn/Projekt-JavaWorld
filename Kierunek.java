import java.util.Random;

public enum Kierunek {

    UP,
    DOWN,
    LEFT,
    RIGHT;

    public static Kierunek getRandomKierunek() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}