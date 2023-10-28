package Viajes;

public class FIltroNot implements Filtro {
    private Filtro f;
    

    public FIltroNot(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Paquete p) {
        return ! f.cumple(p);
    }
    
}
