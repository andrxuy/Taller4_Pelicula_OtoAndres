package tallerOtoAndres;

import java.util.HashSet;
import java.util.Set;

public class HashSetPelicula {
    public static void main(String[] args) {
        Set<Pelicula> peliculas = new HashSet<>();

        // Agregar películas
        peliculas.add(new Pelicula("Inception", "Nolan", "Ciencia Ficción", 148));
        peliculas.add(new Pelicula("El Padrino", "Coppola", "Drama", 175));
        peliculas.add(new Pelicula("Inception", "Nolan", "Ciencia Ficción", 148)); // Duplicado

        System.out.println("=== PELÍCULAS (HASHSET EVITA DUPLICADOS) ===");
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
        System.out.println("Total: " + peliculas.size() + " películas únicas");
    }
}