package Parcial;

public class FiltroXcategoria implements Filtro{
    private String categoria;
    
    public FiltroXcategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getCategoria().equals(categoria);
    }
    
}
