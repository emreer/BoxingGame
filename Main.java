public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("A", 120, 30, 94, 50);
        Fighter f2 = new Fighter("B", 85, 20, 95, 50);

        Match match = new Match(f1, f2, 90, 95);
        match.run();

    }
}