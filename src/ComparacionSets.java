import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparacionSets {
    public static void main(String[] args) {
        probarSet("HashSet", new HashSet<>());
        probarSet("TreeSet", new TreeSet<>());

        probarOperacionesMatematicas();
    }

    private static void probarSet(String nombre, Set<String> conjunto) {
        conjunto.add("Python");
        conjunto.add("Java");
        conjunto.add("SQL");
        conjunto.add("Docker");
        conjunto.add("Java");
        conjunto.add("Git");

        System.out.println("\n--- " + nombre + " ---");
        System.out.println(conjunto);
        System.out.println("Contiene Java: " + conjunto.contains("Java"));
        System.out.println("Tamaño: " + conjunto.size());
    }

    private static void probarOperacionesMatematicas() {
        Set<String> grupoA = new HashSet<>();
        grupoA.add("Java");
        grupoA.add("Python");
        grupoA.add("SQL");

        Set<String> grupoB = new HashSet<>();
        grupoB.add("Python");
        grupoB.add("Docker");
        grupoB.add("Git");

        System.out.println("OPERACIONES MATEMATICAS");
        System.out.println("Grupo A: " + grupoA);
        System.out.println("Grupo B: " + grupoB);

        // union (addAll)
        Set<String> union = new HashSet<>(grupoA);
        union.addAll(grupoB);
        System.out.println("Unión: " + union);

        // intersección (retainAll)
        Set<String> interseccion = new HashSet<>(grupoA);
        interseccion.retainAll(grupoB);
        System.out.println("Intersección: " + interseccion);

        // diferencia (removeAll)
        Set<String> diferencia = new HashSet<>(grupoA);
        diferencia.removeAll(grupoB);
        System.out.println("Diferencia (A - B): " + diferencia);
    }
}