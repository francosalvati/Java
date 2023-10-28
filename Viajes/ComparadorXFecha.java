package Viajes;

import java.util.Comparator;

public class ComparadorXFecha implements Comparator<Paquete> {
    
    @Override
    public int compare(Paquete p1, Paquete p2){
        if(p1.getFechadePago() == null || p1.getFechadePago().isAfter(p2.getFechadePago()))
            return -1;
        else if(p1.getFechadePago().isAfter(p2.getFechadePago()))
            return 1;
        else
            return 0;
    }   
}
