package ve.edu.ucab;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private double espacioDisponible;
    private List<ContenidoReproducible> favoritos;

    public Usuario(String nombre, double espacioDisponible) {
        this.nombre = nombre;
        this.espacioDisponible = espacioDisponible;
        this.favoritos = new ArrayList<>();
    }

    public void agregarFavorito(ContenidoMultimedia contenidoReproducible){
        favoritos.add(contenidoReproducible);
        contenidoReproducible.setEsFavorito(true);
    }
}
