package FabricaMuebles;

public class PoliticaCategoria implements Politica {
    private String categoria;
    

    public PoliticaCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public boolean cumple(Pedido p) {
        return p.getCaracteristicas().contains(categoria);
    }
    
}
