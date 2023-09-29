// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Alice", true);
        Wilder wilder2 = new Wilder("Hope", false);
        Wilder wilder3 = new Wilder("Manon", true);
        Wilder wilder4 = new Wilder("Edward", false);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
        System.out.println(wilder4.whoAmI());
    }
}