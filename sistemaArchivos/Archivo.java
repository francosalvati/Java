package sistemaArchivos;

import java.util.ArrayList;

public class Archivo extends Elemento{

    private double tamanio;

    public Archivo(String nombre, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String toString(){
        return this.getNombre();
    }

    @Override
    public ArrayList<Archivo> buscarArchvios(Buscador c) {
        ArrayList<Archivo> ret = new ArrayList<>();
        if (c.cumple(this))
            ret.add(this);
        return ret;
    }
}
