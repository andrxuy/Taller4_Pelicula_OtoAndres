package tallerOtoAndres;

import java.util.ArrayList;
import java.util.List;

public class ColectionPelicula {
    public static void main(String[] args) {
        List<Pelicula> peliculas =new ArrayList<Pelicula>();
        peliculas.add(new Pelicula("Inception", "Christopher Nolan", "Ciencia Ficción", 148));
        peliculas.add(new Pelicula("El Padrino", "Francis Ford Coppola", "Drama", 175));
        peliculas.add(new Pelicula("Toy Story", "John Lasseter", "Animación", 81));

    }
     
}
