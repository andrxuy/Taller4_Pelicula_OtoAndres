package tallerOtoAndres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerPelicula {
    public static void main(String[] args) {
        List<PeliculaV2> peliculas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas películas quiere agregar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Película " + (i+1) + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Director: ");
            String director = sc.nextLine();
            System.out.print("Género: ");
            String genero = sc.nextLine();
            System.out.print("Duración (min): ");
            int duracion = sc.nextInt();
            System.out.print("Año: ");
            int año = sc.nextInt();
            System.out.print("Rating: ");
            double rating = sc.nextDouble();
            sc.nextLine();

            peliculas.add(new PeliculaV2(nombre, director, genero, duracion, año, rating));
        }

        System.out.println("\n=== PELÍCULAS AGREGADAS ===");
        for (PeliculaV2 p : peliculas) {
            System.out.println(p);
        }

        sc.close();
    }
}