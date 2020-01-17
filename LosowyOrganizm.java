import java.util.Random;

public enum LosowyOrganizm {

    L,
    M,
    Z,
    S,
    C,
    G;

    public static LosowyOrganizm getRandomElement() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}