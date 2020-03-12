package generics_collections;

public class GenericMethod {

    public static <T> boolean isEqual(GenericType<T> g1, GenericType<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String[] args) {
        GenericType<String> g1 = new GenericType<>();
        g1.set("Pencil");

        GenericType<String> g2 = new GenericType<>();
        g2.set("Pencil");

        if(GenericMethod.isEqual(g1, g2)) {
            System.out.println("G1 equal g2");
        }
    }
}
