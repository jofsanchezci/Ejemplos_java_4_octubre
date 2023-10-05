import java.util.ArrayList;

public class EjArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> listaDeNombres = new ArrayList<>();

        // Agregar elementos a la lista
        listaDeNombres.add("Juan");
        listaDeNombres.add("María");
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Pablo");

        // Acceder a elementos por índice
        System.out.println("El primer nombre es: " + listaDeNombres.get(0));

        // Iterar a través de la lista
        System.out.println("Nombres en la lista:");
        for (String nombre : listaDeNombres) {
            System.out.println(nombre);
        }

        // Obtener el tamaño de la lista
        System.out.println("El tamaño de la lista es: " + listaDeNombres.size());

        // Verificar si la lista contiene un elemento
        if (listaDeNombres.contains("María")) {
            System.out.println("La lista contiene a María.");
        }

        // Eliminar un elemento de la lista
        listaDeNombres.remove("Pedro");
        System.out.println("Después de eliminar a Pedro:");
        for (String nombre : listaDeNombres) {
            System.out.println(nombre);
        }

        // Vaciar la lista
        listaDeNombres.clear();
        System.out.println("Después de vaciar la lista, el tamaño es: " + listaDeNombres.size());
    }
}
