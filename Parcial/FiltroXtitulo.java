package Parcial;

public class FiltroXtitulo implements Filtro{
    private String titulo;
    
    public FiltroXtitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().equals(titulo);
    }

}
