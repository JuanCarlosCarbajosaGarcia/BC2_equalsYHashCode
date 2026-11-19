public class TestLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("Shinigami","Autor1",2020);
        Libro l2 = new Libro("El Quijote");
        Libro l3 = new Libro("El quinto elemnto","Autor2");

        l2.setAutor("Miguel de Cervantes");
        l2.setAnio(1605);

        l3.setAnio(2014);

        System.out.println("Libro 1: "+l1);
        System.out.println("Libro 2: "+l2);
        System.out.println("Libro 3: "+l3);



        Libro l4 = new Libro("El camino","Miguel Delibes",1950);
        Libro l5 = new Libro("El camino","Miguel Delibes",1950);

        System.out.println("Libro 4: "+l4);
        System.out.println("Libro 5: "+l5);

        System.out.println("Libro 4 == Libro 5: "+(l4==l5));
        System.out.println("Libro 4 equals Libro 5: "+l4.equals(l5));

        System.out.println("Libro 4 equals null: "+l4.equals(null));
        System.out.println("Libro 4 equals (): "+l4.equals("texto"));
        System.out.println("Libro 4 equals l4: "+l4.equals(l4));

        System.out.println("HashCode: "+l4.hashCode());
        System.out.println("Libro 5: "+l5.hashCode());
        System.out.println("Libro 2: "+l2.hashCode());
    }
}