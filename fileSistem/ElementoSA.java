import java.time.LocalDate;
import java.util.Objects;

public abstract class ElementoSA {
    private String nombre;
    private LocalDate fCreacion;
    private Carpeta contenedor = null;

    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fCreacion = LocalDate.now();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carpeta getContenedor() {
        return contenedor;
    }

    public void setContenedor(Carpeta contenedor) {
        this.contenedor = contenedor;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getfCreacion() {
        return fCreacion;
    }

    public String toString(){
        return this.nombre;
    }

    public abstract double getTamanio();
    public int cantElementos(){
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        ElementoSA otro = (ElementoSA) o;
        try{
            return otro.getNombre().equals(this.getNombre());
        }
        catch (Exception e){
            return false;
        }
    }

}
