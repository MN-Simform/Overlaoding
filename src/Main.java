public class Main {
    public static void main(String[] args) {
        Overload ol = new Overload();
        Overload ol2 = new Overload("Constructor Overload");

        System.out.println(ol.show(5,5));
        System.out.println(ol.show(10,10,10));
        System.out.println(ol.show(3.3,6.6));
        System.out.println(ol.show("Nim","it"));
        System.out.println(ol2.show("Mandaviya"));
    }
}