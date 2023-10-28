package Viajes;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Paquete> {
    private Comparator<Paquete> c1, c2;

    public ComparadorCompuesto(Comparator<Paquete> c1, Comparator<Paquete> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Paquete o1, Paquete o2) {
        int ret = c1.compare(o1, o2);
        if(ret != 0)
            return ret;
        else {
            ret = c2.compare(o1, o2);
            return ret;
        }
    }
}
