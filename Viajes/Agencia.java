package Viajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Agencia{
    private ArrayList<Paquete> paquetes;

    public Agencia() {
        this.paquetes = new ArrayList<>();
    }

    public ArrayList<Paquete> getPaquetes() {
        return new ArrayList<>(paquetes);
    }

    public void setPaquetes(Paquete p) {
        this.paquetes.add(p);;
    }

    public ArrayList<Paquete> buscar(Filtro f, Comparator<Paquete> c){
        ArrayList<Paquete> ret = new ArrayList<>();
        for(Paquete p: paquetes){
            if(f.cumple(p)){
                ret.add(p);
            }
        }
        System.out.print(ret) ;
        Collections.sort(ret);
        return ret;
    }
    
}
