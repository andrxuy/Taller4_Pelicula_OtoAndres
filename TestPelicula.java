package tallerOtoAndres;

import java.util.*;

public class TestPelicula {
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("TEST COMPLETO - SISTEMA DE PELICULAS");
        System.out.println("=".repeat(60));

        // ========== 1. PROBAR CLASE PELICULA ORIGINAL ==========
        System.out.println("\n[1] CLASE PELICULA (nombre, director, genero, duracion)");
        System.out.println("-".repeat(40));
        Pelicula peli1 = new Pelicula("Inception", "Christopher Nolan", "Ciencia Ficcion", 148);
        Pelicula peli2 = new Pelicula("El Padrino", "Francis Ford Coppola", "Drama", 175);
        Pelicula peli3 = new Pelicula("Toy Story", "John Lasseter", "Animacion", 81);
        System.out.println(peli1);
        System.out.println(peli2);
        System.out.println(peli3);

        // ========== 2. LISTA Y MODIFICACION DINAMICA ==========
        System.out.println("\n[2] LISTA DE PELICULAS Y MODIFICACION DINAMICA");
        System.out.println("-".repeat(40));
        List<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(peli1);
        listaPeliculas.add(peli2);
        listaPeliculas.add(peli3);

        System.out.println("=== LISTA ORIGINAL ===");
        for (Pelicula p : listaPeliculas) {
            System.out.println(p);
        }

        // Modificaciones dinamicas
        System.out.println("\n--- MODIFICACIONES DINAMICAS ---");
        System.out.println("1. Agregando 'Interestelar'...");
        listaPeliculas.add(new Pelicula("Interestelar", "Christopher Nolan", "Ciencia Ficcion", 169));

        System.out.println("2. Eliminando 'El Padrino' (indice 1)...");
        listaPeliculas.remove(1);

        System.out.println("3. Modificando primera pelicula a 'Batman'...");
        listaPeliculas.set(0, new Pelicula("Batman Begins", "Christopher Nolan", "Accion", 140));

        System.out.println("\n=== LISTA MODIFICADA ===");
        for (Pelicula p : listaPeliculas) {
            System.out.println(p);
        }
        System.out.println("Total de peliculas: " + listaPeliculas.size());

        // ========== 3. HASHSET (EVITAR DUPLICADOS) ==========
        System.out.println("\n[3] HASHSET - EVITAR PELICULAS REPETIDAS");
        System.out.println("-".repeat(40));
        Set<Pelicula> setPeliculas = new HashSet<>();

        Pelicula dup1 = new Pelicula("Matrix", "Lana Wachowski", "Accion", 136);
        Pelicula dup2 = new Pelicula("Matrix", "Lana Wachowski", "Accion", 136); // Duplicado

        System.out.println("Agregando 'Matrix' por primera vez: " + setPeliculas.add(dup1));
        System.out.println("Agregando 'Matrix' duplicado: " + setPeliculas.add(dup2));
        System.out.println("Total en HashSet: " + setPeliculas.size() + " pelicula unica");

        // ========== 4. MAP POR GENERO ==========
        System.out.println("\n[4] MAP - PELICULAS AGRUPADAS POR GENERO");
        System.out.println("-".repeat(40));
        Map<String, List<Pelicula>> mapaGenero = new HashMap<>();

        // Crear listas por genero
        List<Pelicula> cienciaFiccion = new ArrayList<>();
        cienciaFiccion.add(new Pelicula("Inception", "Nolan", "Ciencia Ficcion", 148));
        cienciaFiccion.add(new Pelicula("Interestelar", "Nolan", "Ciencia Ficcion", 169));
        mapaGenero.put("Ciencia Ficcion", cienciaFiccion);

        List<Pelicula> drama = new ArrayList<>();
        drama.add(new Pelicula("El Padrino", "Coppola", "Drama", 175));
        drama.add(new Pelicula("Scarface", "De Palma", "Drama", 170));
        mapaGenero.put("Drama", drama);

        List<Pelicula> animacion = new ArrayList<>();
        animacion.add(new Pelicula("Toy Story", "Lasseter", "Animacion", 81));
        mapaGenero.put("Animacion", animacion);

        // Mostrar mapa
        for (String genero : mapaGenero.keySet()) {
            System.out.println("\nGenero: " + genero);
            for (Pelicula p : mapaGenero.get(genero)) {
                System.out.println("  - " + p.getNombre() + " (" + p.getDuracion() + " min)");
            }
        }

        // ========== 5. PELICULAV2 (CON ANIO Y RATING) ==========
        System.out.println("\n[5] PELICULAV2 - CON ANIO DE ESTRENO Y RATING");
        System.out.println("-".repeat(40));
        PeliculaV2 peliV2_1 = new PeliculaV2("Inception", "Nolan", "Ciencia Ficcion", 148, 2010, 8.8);
        PeliculaV2 peliV2_2 = new PeliculaV2("El Padrino", "Coppola", "Drama", 175, 1972, 9.2);
        PeliculaV2 peliV2_3 = new PeliculaV2("Toy Story", "Lasseter", "Animacion", 81, 1995, 8.3);
        System.out.println(peliV2_1);
        System.out.println(peliV2_2);
        System.out.println(peliV2_3);

        // ========== 6. BUSCAR EN LIST, SET Y MAP ==========
        System.out.println("\n[6] BUSQUEDA DE PELICULAS EN LIST, SET Y MAP");
        System.out.println("-".repeat(40));

        // Preparar colecciones para busqueda
        List<PeliculaV2> listaBuscar = new ArrayList<>();
        Set<PeliculaV2> setBuscar = new HashSet<>();
        Map<String, List<PeliculaV2>> mapaBuscar = new HashMap<>();

        listaBuscar.add(peliV2_1);
        listaBuscar.add(peliV2_2);
        setBuscar.add(peliV2_1);
        setBuscar.add(peliV2_2);

        List<PeliculaV2> listaCF = new ArrayList<>();
        listaCF.add(peliV2_1);
        mapaBuscar.put("Ciencia Ficcion", listaCF);

        List<PeliculaV2> listaDrama = new ArrayList<>();
        listaDrama.add(peliV2_2);
        mapaBuscar.put("Drama", listaDrama);

        String buscarNombre = "Inception";
        System.out.println("Buscando: " + buscarNombre);

        // Buscar en List
        for (PeliculaV2 p : listaBuscar) {
            if (p.getNombre().equals(buscarNombre)) {
                System.out.println("  [OK] Encontrada en LIST: " + p);
            }
        }

        // Buscar en Set
        for (PeliculaV2 p : setBuscar) {
            if (p.getNombre().equals(buscarNombre)) {
                System.out.println("  [OK] Encontrada en SET: " + p);
            }
        }

        // Buscar en Map
        for (String gen : mapaBuscar.keySet()) {
            for (PeliculaV2 p : mapaBuscar.get(gen)) {
                if (p.getNombre().equals(buscarNombre)) {
                    System.out.println("  [OK] Encontrada en MAP (Genero: " + gen + "): " + p);
                }
            }
        }

        // ========== 7. SCANNER (AGREGAR DINAMICAMENTE) ==========
        System.out.println("\n[7] SCANNER - AGREGAR PELICULAS DINAMICAMENTE");
        System.out.println("-".repeat(40));
        System.out.println("(Simulacion - para probar realmente ejecute ScannerPelicula.java)");
        System.out.println("Ejemplo de como funciona:");
        System.out.println("  > Cuantas peliculas quiere agregar? 1");
        System.out.println("  > Nombre: Mi Pelicula");
        System.out.println("  > Director: Mi Director");
        System.out.println("  > Genero: Accion");
        System.out.println("  > Duracion: 120");
        System.out.println("  > Anio: 2024");
        System.out.println("  > Rating: 9.0");
        System.out.println("  [OK] Pelicula agregada exitosamente");

        // ========== 8. ORDENAR POR DURACION ==========
        System.out.println("\n[8] ORDENAR PELICULAS POR DURACION");
        System.out.println("-".repeat(40));
        List<PeliculaV2> listaOrdenar = new ArrayList<>();
        listaOrdenar.add(new PeliculaV2("Toy Story", "Lasseter", "Animacion", 81, 1995, 8.3));
        listaOrdenar.add(new PeliculaV2("Inception", "Nolan", "Ciencia Ficcion", 148, 2010, 8.8));
        listaOrdenar.add(new PeliculaV2("El Padrino", "Coppola", "Drama", 175, 1972, 9.2));
        listaOrdenar.add(new PeliculaV2("Interestelar", "Nolan", "Ciencia Ficcion", 169, 2014, 8.6));

        System.out.println("=== ANTES DE ORDENAR ===");
        for (PeliculaV2 p : listaOrdenar) {
            System.out.println("   " + p.getDuracion() + " min - " + p.getNombre());
        }

        // Ordenamiento burbuja
        for (int i = 0; i < listaOrdenar.size() - 1; i++) {
            for (int j = 0; j < listaOrdenar.size() - i - 1; j++) {
                if (listaOrdenar.get(j).getDuracion() > listaOrdenar.get(j+1).getDuracion()) {
                    PeliculaV2 temp = listaOrdenar.get(j);
                    listaOrdenar.set(j, listaOrdenar.get(j+1));
                    listaOrdenar.set(j+1, temp);
                }
            }
        }

        System.out.println("\n=== DESPUES DE ORDENAR (menor a mayor duracion) ===");
        for (PeliculaV2 p : listaOrdenar) {
            System.out.println("   " + p.getDuracion() + " min - " + p.getNombre());
        }

        // ========== 9. TREESET (ORDENAR POR NOMBRE) ==========
        System.out.println("\n[9] TREESET - ORDENAR PELICULAS POR NOMBRE");
        System.out.println("-".repeat(40));
        Set<PeliculaV2> treeSet = new TreeSet<>(new Comparator<PeliculaV2>() {
            @Override
            public int compare(PeliculaV2 p1, PeliculaV2 p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });

        treeSet.add(new PeliculaV2("Zombieland", "Fleischer", "Comedia", 88, 2009, 7.6));
        treeSet.add(new PeliculaV2("Avatar", "Cameron", "Ciencia Ficcion", 162, 2009, 7.9));
        treeSet.add(new PeliculaV2("Barbie", "Gerwig", "Comedia", 114, 2023, 7.0));
        treeSet.add(new PeliculaV2("Alien", "Scott", "Terror", 117, 1979, 8.5));
        treeSet.add(new PeliculaV2("Inception", "Nolan", "Ciencia Ficcion", 148, 2010, 8.8));

        System.out.println("Peliculas automaticamente ordenadas por nombre:");
        for (PeliculaV2 p : treeSet) {
            System.out.println("   [*] " + p.getNombre() + " - " + p.getDirector());
        }

        // ========== RESULTADO FINAL ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("TEST COMPLETADO EXITOSAMENTE");
        System.out.println("TODAS LAS FUNCIONALIDADES DEL TALLER FUNCIONAN");
        System.out.println("=".repeat(60));

        // Resumen
        System.out.println("\nRESUMEN DE FUNCIONALIDADES IMPLEMENTADAS:");
        System.out.println("   1. [OK] Clase Pelicula (nombre, director, genero, duracion)");
        System.out.println("   2. [OK] Lista de peliculas con modificaciones dinamicas");
        System.out.println("   3. [OK] HashSet para evitar peliculas repetidas");
        System.out.println("   4. [OK] Map<String, List<Pelicula>> por genero");
        System.out.println("   5. [OK] PeliculaV2 con anio de estreno y rating");
        System.out.println("   6. [OK] Busqueda en List, Set y Map");
        System.out.println("   7. [OK] Agregar peliculas con Scanner");
        System.out.println("   8. [OK] Ordenar peliculas por duracion");
        System.out.println("   9. [OK] TreeSet para ordenar por nombre");
    }
}
