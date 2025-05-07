package ve.edu.ucab;

public abstract  class ContenidoMultimedia implements ContenidoReproducible{

    private String titulo; //Nombre del contenido.
    private String genero; //Género del contenido.
    private int    duracion;  //Duración en minutos.
    private int    vecesReproducido; //Contador de reproducciones.
    private boolean    esFavorito; //Indica si está en la lista de favoritos de algún usuario.

    //Creamos Constructor.

    public ContenidoMultimedia(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.vecesReproducido = vecesReproducido;
        this.esFavorito = esFavorito;
    }

    //Creamos Otro Constructor

    public ContenidoMultimedia(String genero, String titulo, int duracion) {
        this.genero = genero;
        this.titulo = titulo;
        this.duracion = duracion;
        this.vecesReproducido = 0;
        this.esFavorito = false;
    }


    //Incrementa vecesReproducido y muestra un mensaje de reproducción.

    @Override
    public void reproducir() {
        vecesReproducido++;
        System.out.println("Reproduciendo");
    }

    //Muestra un mensaje de pausa.

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    //Retornan los valores de los atributos correspondientes.

    @Override
    public int obtenerDuracion() {
        return duracion;
    }

    @Override
    public String obtenerTitulo() {
        return titulo;
    }

    @Override
    public String obtenerGenero() {
        return genero;
    }

    @Override
    public boolean esFavorito() {
        return esFavorito;
    }

    // Ahora creamos getters o setters

    public void setEsFavorito(boolean esFavorito) {
        this.esFavorito = esFavorito;
    }

    //Creamos el metodo registrar interaccion
    //protected: Solo los hijos lo van a poder ver

    protected void registrarInteraccion(){
        System.out.println("Interaccion registrada" + titulo + "Genero: " + genero + "Se reprodujo: " + vecesReproducido);
    }
    public abstract double calcularPuntuacion();

    //Getter de las veces reproducidas


    public int getVecesReproducido() {
        return vecesReproducido;
    }
}
