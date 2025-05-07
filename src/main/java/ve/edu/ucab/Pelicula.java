package ve.edu.ucab;

public class Pelicula extends ContenidoMultimedia implements ContenidoDescargable{

    private String director;
    private Resolucion resolucion; // Resolución del video (ej. "4K", "HD").

    //Creamos constructor

    public Pelicula(String genero, String titulo, int duracion, String director, Resolucion resolucion) {
        super(genero, titulo, duracion);
        this.director = director;
        this.resolucion = resolucion;
    }

    // Creamos contructor

    public Pelicula(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito, String director, Resolucion resolucion) {
        super(titulo, genero, duracion, vecesReproducido, esFavorito);
        this.director = director;
        this.resolucion = resolucion;
    }

    @Override
    public double descargar() {
        if (resolucion == Resolucion._4k){
            return 5000;
        }
        else {
            return 2000;
        }
    }

    @Override
    public boolean verificarEspacioRequerido(double espacioDisponible) {
        if(espacioDisponible > descargar()){
            return true;
        }
        else{
            return false;
        }
    }

    // Retorna vecesReproducido * 0.5 + (10 si es 4K, 0 si no).

    @Override
    public double calcularPuntuacion() {
        if(resolucion == Resolucion._4k){
            return (this.getVecesReproducido() * 0.5) + 10;
        }
        else {
            return (this.getVecesReproducido() * 0.5) + 0;
        }

    }

}
