package mypackage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running main");
        final var main = new Main();
        System.out.println(main.getClass().getCanonicalName());
    }
}
