package sistemaArchivos;

public class BuscadorNot implements Buscador {
    private Buscador b;
    
    public BuscadorNot(Buscador b) {
        this.b = b;
    }

    @Override
    public boolean cumple(Archivo a) {
        return !b.cumple(a);
    }
        
}
