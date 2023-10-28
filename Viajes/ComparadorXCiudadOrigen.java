package Viajes;

import java.util.Comparator;

public class ComparadorXCiudadOrigen implements Comparator<Paquete>{

    @Override
    public int compare(Paquete o1, Paquete o2) {
        return o1.getCiudadOrigen().compareTo(o2.getCiudadOrigen());
    }
    
}