package Viajes;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Paquete implements Comparable<Paquete>{
    private int id;
    private int nPasajeros;
    public Paquete(int id,int nPasajeros) {
        this.id = id;
        this.nPasajeros = nPasajeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract ArrayList<Paquete> buscarPaquete(Filtro f);

    public abstract LocalDate getFechadePago();

    public abstract double getCosto();

    public abstract String getCiudadOrigen();
    public abstract String getCiudadDestino();
    
    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public int compareTo(Paquete p){
        return this.getId() - p.getId();
    }

    @Override
    public String toString() {
        return "Paquete [id=" + id + ", Origen=" + this.getCiudadOrigen() + "] \n";
    }

    
}
