package Viajes;

import java.util.Comparator;

public class ComparadorXId implements Comparator<Paquete>{
    
    @Override
    public int compare(Paquete p1, Paquete p2){
        return p1.getId() - p2.getId();
    }
}
