package FabricaMuebles;

import java.util.Comparator;

public class OrdenPorCosto implements Comparator<Pedido>{


    @Override
    public int compare(Pedido o1, Pedido o2) {
            return o1.getCosto() - o2.getCosto();
    }
    
}
