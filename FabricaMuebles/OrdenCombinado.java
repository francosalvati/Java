package FabricaMuebles;

import java.util.Comparator;

public class OrdenCombinado implements Comparator<Pedido> {
    private Comparator<Pedido> c1, c2;

    public OrdenCombinado(Comparator<Pedido> c1, Comparator<Pedido> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Pedido p1, Pedido p2) {
        if (this.c1.compare(p1, p2) != 0)
            return this.c1.compare(p1, p2);
        else
            return this.c2.compare(p1, p2);
    }

}
