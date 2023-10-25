package Parcial;

public class FiltroXcontenido implements Filtro {

    private String contenido;
    
    public FiltroXcontenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getContenido().contains(contenido);
    }
    
}
