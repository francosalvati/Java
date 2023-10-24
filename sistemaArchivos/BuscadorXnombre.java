package sistemaArchivos;

public class BuscadorXnombre implements Buscador{

    private String nombre;
    
    public BuscadorXnombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Archivo a) {
        return a.getNombre().contains(nombre);
    }
    
}
