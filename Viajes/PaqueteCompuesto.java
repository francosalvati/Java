package Viajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PaqueteCompuesto extends Paquete {

    private ArrayList<Paquete> paquetes;

    public PaqueteCompuesto(int id, int nPasajeros) {
        super(id, nPasajeros);
        this.paquetes = new ArrayList<>();
    }

    public void setPaquete(Paquete p) {
        if (paquetes.isEmpty())
            paquetes.add(p);
        else if (paquetes.get(paquetes.size() - 1).getCiudadDestino().equals(p.getCiudadOrigen()))
            paquetes.add(p);
        else
            System.out.println("ese paquete no puede agregarse");
    }

    public ArrayList<Paquete> getPaquetes() {
        ArrayList<Paquete> ret = new ArrayList<>();

        return ret;
    }

    @Override
    public ArrayList<Paquete> buscarPaquete(Filtro f) {
        ArrayList<Paquete> ret = new ArrayList<>();
        for (Paquete p : paquetes) {
            if (f.cumple(p))
                ret.addAll(p.buscarPaquete(f));
        }
        return ret;
    }

    public ArrayList<Paquete> buscarPaqueteOrdenado(Filtro f, Comparator<Paquete> c) {
        ArrayList<Paquete> ret = buscarPaquete(f);
        Collections.sort(ret, c);
        return ret;
    }

    @Override
    public LocalDate getFechadePago() {
        int i = 0;
        while (i < paquetes.size()) {
            if (paquetes.get(i) != null)
                i++;
            else
                return null;
        }
        return paquetes.get(i).getFechadePago();
    }

    @Override
    public double getCosto() {
        double suma = 0;
        for (Paquete p : paquetes) {
            suma += p.getCosto();
        }
        return suma;
    }

    @Override
    public String getCiudadDestino() {
        return paquetes.get(paquetes.size() - 1).getCiudadDestino();
    }

    @Override
    public String getCiudadOrigen() {
        return paquetes.get(0).getCiudadOrigen();
    }

    @Override
    public String toString() {
        return "PaqueteCompuesto [paquetes=" + this.getId() + "]";
    }

    
}
