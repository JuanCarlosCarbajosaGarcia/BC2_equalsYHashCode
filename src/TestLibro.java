public class TestLibro {
    static void main() {
        Libro l1 = new Libro("patata","manfredo",2025);
        Libro l2 = new Libro("patata","manfredo",2025);
        Libro l3 = new Libro("","",0);

        if (l1==l2) System.out.println("l1==l2");
        if (l1.equals(l2)) System.out.println("l1.equals(l2)");

        if (l3.equals(null)) System.out.println(l1.hashCode());

        if (l3.equals("")) System.out.println(l1.hashCode());


    }
}
