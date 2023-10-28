package FabricaMuebles;

public class PoliticaNot implements Politica {
    private Politica p;

    public PoliticaNot(Politica p) {
        this.p = p;
    }

    @Override
    public boolean cumple(Pedido p) {
        return !this.p.cumple(p);
    }

    
}
