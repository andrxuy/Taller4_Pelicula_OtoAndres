package tallerOtoAndres;

import java.util.*;

public class MapPelicula {
    public static void main(String[] args) {
        Map<String, List<Pelicula>> mapaGenero = new HashMap<>();

        // Crear películas
        Pelicula p1 = new Pelicula("Inception", "Nolan", "Ciencia Ficción", 148);
        Pelicula p2 = new Pelicula("Interestelar", "Nolan", "Ciencia Ficción", 169);
        Pelicula p3 = new Pelicula("El Padrino", "Coppola", "Drama", 175);
        Pelicula p4 = new Pelicula("Toy Story", "Lasseter", "Animación", 81);

        // Agrupar por género
        // Ciencia Ficción
        List<Pelicula> cienciaFiccion = new ArrayList<>();
        cienciaFiccion.add(p1);
        cienciaFiccion.add(p2);
        mapaGenero.put("Ciencia Ficción", cienciaFiccion);

        // Drama
        List<Pelicula> drama = new ArrayList<>();
        drama.add(p3);
        mapaGenero.put("Drama", drama);

        // Animación
        List<Pelicula> animacion = new ArrayList<>();
        animacion.add(p4);
        mapaGenero.put("Animación", animacion);

        // Mostrar mapa
        System.out.println("=== PELÍCULAS POR GÉNERO ===");
        for (String genero : mapaGenero.keySet()) {
            System.out.println("\nGénero: " + genero);
            for (Pelicula p : mapaGenero.get(genero)) {
                System.out.println("  - " + p.getNombre());
            }
        }
    }
}