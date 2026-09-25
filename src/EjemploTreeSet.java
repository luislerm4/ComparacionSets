import java.util.Comparator;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> calificaciones = new TreeSet<>();

        calificaciones.add(65);
        calificaciones.add(70);
        calificaciones.add(75);
        calificaciones.add(80);
        calificaciones.add(85);
        calificaciones.add(90);
        calificaciones.add(95);

        System.out.println("Mínimo: " + calificaciones.first());
        System.out.println("Máximo: " + calificaciones.last());

        System.out.println("lower(80): " + calificaciones.lower(80));
        System.out.println("higher(80): " + calificaciones.higher(80));
        System.out.println("floor(82): " + calificaciones.floor(82));
        System.out.println("ceiling(82): " + calificaciones.ceiling(82));

        System.out.println("Subconjunto (70 a 90): " + calificaciones.subSet(70, true, 90, true));

        TreeSet<String> tecnologias = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        tecnologias.add("Java");
        tecnologias.add("python");
        tecnologias.add("JavaScript");

        System.out.println("Orden personalizado: " + tecnologias);
    }
}