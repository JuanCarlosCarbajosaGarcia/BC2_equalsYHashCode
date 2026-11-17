public class TestLibro {
    static void main() {
        Libro l1 = new Libro("patata","manfredo",2025);
        Libro l2 = new Libro("patata","manfredo",2025);

        if (l1==l2) System.out.println("l1==l2");
        if (l1.equals(l2)) System.out.println("l1.equals(l2)");

        l1.equals(null);
        System.out.println(l1.hashCode());

        l1.equals("");
        System.out.println(l1.hashCode());


    }
}
