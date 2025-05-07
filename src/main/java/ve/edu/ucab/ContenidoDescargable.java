package ve.edu.ucab;

public interface ContenidoDescargable {

    double descargar();    //Retorna el tamaño del contenido en MB (double).
    boolean   verificarEspacioRequerido(double espacioDisponible); //Verifica si hay suficiente espacio para la descarga; lanza una excepción si no lo hay.
}
