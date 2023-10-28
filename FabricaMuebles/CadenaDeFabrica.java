package FabricaMuebles;

import java.util.ArrayList;

public class CadenaDeFabrica {
    private ArrayList<Fabrica> fabricas;

    public CadenaDeFabrica() {
        this.fabricas = new ArrayList<>();
    }

    public ArrayList<Fabrica> getFabricas() {
        return new ArrayList<>(fabricas);
    }


    public void setFabricas(Fabrica fabrica) {
        if(!fabricas.contains(fabrica))
            fabricas.add( fabrica);
    }

    public void setPedidoenFabrica(Pedido p){
        boolean entregado = false;
        int i = 0;
        while(!entregado && i < fabricas.size()){
            if(getFabricas().get(i).setColaDeEspera(p))
                entregado = true;
            i++;
        }
    }

    @Override
    public String toString() {
        return "CadenaDeFabrica [fabricas=" + fabricas + "]";
    }

    
}
