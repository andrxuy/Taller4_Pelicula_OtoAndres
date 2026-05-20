package tallerOtoAndres;

public class Pelicula {
    private String nombre;
    private String director;
    private String genero;
    private double duracion;

    public Pelicula(String nombre, String director, String genero, double duracion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getNombre() {return this.nombre;}
    public String getDirector() {return this.director;}
    public String getGenero() {return this.genero;}
    public double getDuracion() {return this.duracion;}

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}

