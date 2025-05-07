package ve.edu.ucab;

public class Main{
    public static void main(String[] args){
        Pelicula pelicula = new Pelicula("Amor","Chuky",7,"Javier",Resolucion._4k);
        Pelicula pelicula2 = new Pelicula("Terror","Son Como niños",2,"danny",Resolucion.HD);
        Usuario usuario = new Usuario("Humberto",10000);
        usuario.agregarFavorito(pelicula);
    }
}