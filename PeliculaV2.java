package tallerOtoAndres;

public class PeliculaV2 {
    private String nombre;
    private String director;
    private String genero;
    private int duracion;
    private int añoEstreno;
    private double rating;

    public PeliculaV2(String nombre, String director, String genero, int duracion, int añoEstreno, double rating) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.añoEstreno = añoEstreno;
        this.rating = rating;
    }

    public String getNombre() { return nombre; }
    public String getDirector() { return director; }
    public String getGenero() { return genero; }
    public int getDuracion() { return duracion; }
    public int getAñoEstreno() { return añoEstreno; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return nombre + " | " + director + " | " + genero + " | " + duracion + " min | Año: " + añoEstreno + " | Rating: " + rating;
    }
}