package tp5_agricultores;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> minerales = new ArrayList<String>();

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.minerales = new ArrayList<String>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void addMineral(String mineral) {
        this.minerales.add(mineral);
    }

    public ArrayList getMinerales(){
        return new ArrayList<String>(minerales);
    }
}
