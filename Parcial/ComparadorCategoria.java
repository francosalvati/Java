package Parcial;
import java.util.Comparator;

public class ComparadorCategoria implements Comparator<Noticia> {

    @Override
    public int compare(Noticia o1, Noticia o2) {
        return o1.getCategoria().compareTo(o2.getCategoria());
    }
    
}
