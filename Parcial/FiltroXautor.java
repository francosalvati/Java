package Parcial;

public class FiltroXautor implements Filtro{
    private String a;

    public FiltroXautor(String a) {
        this.a = a;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getAutor().equals(a);
    }
    
}
