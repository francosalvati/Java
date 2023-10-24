package sistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {
    private String nombre;
    private LocalDate fechaCreacion;

    public Elemento(String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public abstract double getTamanio();

    public int getCantidadElementos(){
        return 1;
    }
    
    public String toString(){
        return this.getNombre();
    }

    public abstract ArrayList<Archivo> buscarArchvios(Buscador c);
}
