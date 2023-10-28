package FabricaMuebles;

import java.util.Comparator;

public class OrdenXFecha implements Comparator<Pedido> {

    public int compare(Pedido p1, Pedido p2) {
        if (p1.getFechaEntrega().isBefore(p2.getFechaEntrega()))
            
            return -1;

        else if (p1.getFechaEntrega().isAfter(p2.getFechaEntrega()))
            
            return 1;

        else return 0;

    }
}
