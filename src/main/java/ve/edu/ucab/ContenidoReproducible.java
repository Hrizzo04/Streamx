package ve.edu.ucab;

public interface ContenidoReproducible {

    void reproducir();   //Inicia la reproducción del contenido.
    void pausar();   //Pausa la reproducción.
    int obtenerDuracion();  //Retorna la duración en minutos (int).
    String obtenerTitulo();    //Retorna el título del contenido (String).
    String obtenerGenero();    //Retorna el género del contenido (String).
    boolean esFavorito();   //Retorna si el contenido está marcado como favorito (boolean).


}
