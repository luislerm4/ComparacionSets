import java.util.Scanner;
import java.util.TreeSet;

public class RegistroParticipantes {
    public static void main(String[] args) {
        TreeSet<String> estudiantes = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n MENÚ DE REGISTRO ");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Mostrar numero de estudiantes");
            System.out.println("6. Consultar estudiantes por rango (A0020 a A0080)");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del estudiante: ");
                    String id = scanner.nextLine();
                    if (estudiantes.add(id)) {
                        System.out.println("Estudiante " + id + " registrado correctamente.");
                    } else {
                        System.out.println("El estudiante " + id + " ya existe en el sistema.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese ID a buscar: ");
                    String idBuscar = scanner.nextLine();
                    if (estudiantes.contains(idBuscar)) {
                        System.out.println("El estudiante " + idBuscar + " SÍ está registrado.");
                    } else {
                        System.out.println("El estudiante " + idBuscar + " NO está registrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese ID a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    if (estudiantes.remove(idEliminar)) {
                        System.out.println("Estudiante " + idEliminar + " eliminado.");
                    } else {
                        System.out.println("El estudiante " + idEliminar + " no fue encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de estudiantes: " + estudiantes);
                    break;
                case 5:
                    System.out.println("Total de estudiantes registrados: " + estudiantes.size());
                    break;
                case 6:
                    System.out.println("Estudiantes entre A0020 y A0080: " + estudiantes.subSet("A0020", true, "A0080", true));
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}