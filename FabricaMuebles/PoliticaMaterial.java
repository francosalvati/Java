package FabricaMuebles;

public class PoliticaMaterial implements Politica {
    private String material;

    public PoliticaMaterial(String material) {
        this.material = material;
    }
    
    public boolean cumple(Pedido p1){
        return p1.getMaterial().equals(this.material);
    }
}
