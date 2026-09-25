import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        Set<String> tecnologias = new HashSet<>();

        tecnologias.add("Java");
        tecnologias.add("Python");
        tecnologias.add("JavaScript");
        tecnologias.add("Java");
        tecnologias.add("SQL");
        tecnologias.add("Python");
        tecnologias.add("Git");
        tecnologias.add("Docker");

        boolean agregado = tecnologias.add("Java");
        System.out.println("¿Se agregó Java? " + agregado);

        boolean agregado2 = tecnologias.add("Kotlin");
        System.out.println("¿Se agregó Kotlin? " + agregado2);

        tecnologias.contains("Java");
        tecnologias.contains("C++");
        tecnologias.remove("Git");
        tecnologias.size();
        tecnologias.isEmpty();


        for (String tecnologia : tecnologias) {
            System.out.println(tecnologia);

            System.out.println();


        }
        System.out.println(tecnologias);

        tecnologias.clear();
    }
}
