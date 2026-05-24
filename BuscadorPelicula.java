package tallerOtoAndres;

import java.util.*;

public class BuscadorPelicula {
    public static void main(String[] args) {
        // Crear colecciones
        List<PeliculaV2> lista = new ArrayList<>();
        Set<PeliculaV2> set = new HashSet<>();
        Map<String, List<PeliculaV2>> mapa = new HashMap<>();

        // Agregar películas
        PeliculaV2 p1 = new PeliculaV2("Inception", "Nolan", "Ciencia Ficción", 148, 2010, 8.8);
        PeliculaV2 p2 = new PeliculaV2("Toy Story", "Lasseter", "Animación", 81, 1995, 8.3);

        lista.add(p1);
        lista.add(p2);
        set.add(p1);
        set.add(p2);

        List<PeliculaV2> cienciaFiccion = new ArrayList<>();
        cienciaFiccion.add(p1);
        mapa.put("Ciencia Ficción", cienciaFiccion);

        List<PeliculaV2> animacion = new ArrayList<>();
        animacion.add(p2);
        mapa.put("Animación", animacion);

        // Buscar una película
        String buscar = "Inception";
        System.out.println("Buscando: " + buscar);

        // Buscar en List
        for (PeliculaV2 p : lista) {
            if (p.getNombre().equals(buscar)) {
                System.out.println("Encontrada en List: " + p);
            }
        }

        // Buscar en Set
        for (PeliculaV2 p : set) {
            if (p.getNombre().equals(buscar)) {
                System.out.println("Encontrada en Set: " + p);
            }
        }

        // Buscar en Map
        for (String genero : mapa.keySet()) {
            for (PeliculaV2 p : mapa.get(genero)) {
                if (p.getNombre().equals(buscar)) {
                    System.out.println("Encontrada en Map (Género: " + genero + "): " + p);
                }
            }
        }
    }
}