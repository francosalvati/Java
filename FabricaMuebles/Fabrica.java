package FabricaMuebles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Fabrica {
    private ArrayList<Pedido> colaDeEspera;
    private Politica politica;
    public Fabrica(Politica politica) {
        this.colaDeEspera = new ArrayList<>();
        this.politica = politica;
    }
    
    public ArrayList<Pedido> getColaDeEspera() {
        return new ArrayList<>(colaDeEspera);
    }

    public boolean setColaDeEspera(Pedido c) {
        if (!colaDeEspera.contains(c) && this.getPolitica().cumple(c)){
            colaDeEspera.add(c);
            return true;
        }
        return false;
    }

    public void ordenarColaDeEspera(Comparator<Pedido> p) {

        Collections.sort(getColaDeEspera(), p);
    }

    public void terminarTarea() {
        colaDeEspera.remove(0);
    }

    public int getGanancias() {
        int suma = 0;
        for (Pedido p : colaDeEspera) {
            suma += p.getPrecioVenta() - p.getCosto();
        }
        return suma;
    }

    public Politica getPolitica() {
        return politica;
    }


    public void setPolitica(Politica politica) {
        this.politica = politica;
    }

    @Override
    public String toString() {
        return "Fabrica [colaDeEspera=" + colaDeEspera + ", politica=" + politica + "] \n";
    }


    
}
