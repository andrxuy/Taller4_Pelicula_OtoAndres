package tallerOtoAndres;

import java.util.*;

public class OrdenarPelicula {
    public static void main(String[] args) {
        List<PeliculaV2> peliculas = new ArrayList<>();

        peliculas.add(new PeliculaV2("Inception", "Nolan", "Ciencia Ficción", 148, 2010, 8.8));
        peliculas.add(new PeliculaV2("Toy Story", "Lasseter", "Animación", 81, 1995, 8.3));
        peliculas.add(new PeliculaV2("El Padrino", "Coppola", "Drama", 175, 1972, 9.2));

        System.out.println("=== ORIGINAL ===");
        for (PeliculaV2 p : peliculas) {
            System.out.println(p.getDuracion() + " min - " + p.getNombre());
        }
        for (int i = 0; i < peliculas.size() - 1; i++) {
            for (int j = 0; j < peliculas.size() - i - 1; j++) {
                if (peliculas.get(j).getDuracion() > peliculas.get(j+1).getDuracion()) {
                    PeliculaV2 temp = peliculas.get(j);
                    peliculas.set(j, peliculas.get(j+1));
                    peliculas.set(j+1, temp);
                }
            }
        }

        System.out.println("\n=== ORDENADAS POR DURACIÓN ===");
        for (PeliculaV2 p : peliculas) {
            System.out.println(p.getDuracion() + " min - " + p.getNombre());
        }
    }
}