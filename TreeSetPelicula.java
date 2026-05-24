package tallerOtoAndres;

import java.util.*;

public class TreeSetPelicula {
    public static void main(String[] args) {
        Set<PeliculaV2> peliculas = new TreeSet<>(new Comparator<PeliculaV2>() {
            @Override
            public int compare(PeliculaV2 p1, PeliculaV2 p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });

        peliculas.add(new PeliculaV2("Zombieland", "Fleischer", "Comedia", 88, 2009, 7.6));
        peliculas.add(new PeliculaV2("Avatar", "Cameron", "Ciencia Ficción", 162, 2009, 7.9));
        peliculas.add(new PeliculaV2("Barbie", "Gerwig", "Comedia", 114, 2023, 7.0));
        peliculas.add(new PeliculaV2("Alien", "Scott", "Terror", 117, 1979, 8.5));

        System.out.println("=== PELÍCULAS ORDENADAS POR NOMBRE ===");
        for (PeliculaV2 p : peliculas) {
            System.out.println(p.getNombre() + " - " + p.getDirector());
        }
    }
}
