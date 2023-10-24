package sistemaArchivos;
import java.util.ArrayList;

public class Carpeta extends Elemento {

    protected ArrayList<Elemento> elementos;

    public Carpeta(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public ArrayList<Elemento> getElementos() {
        return new ArrayList<>(elementos);
    }

    public void setElementos(Elemento e) {
        if (!elementos.contains(e))
            elementos.add(e);
    }

    @Override
    public double getTamanio() {
        double suma = 0;
        for(int i = 0; i < elementos.size(); i++ ){
            suma += elementos.get(i).getTamanio();
        }
        return suma;
    }

    public int getCantidadElementos() {
        int suma = 0;
        for(int i = 0; i < elementos.size(); i++ ){
            suma += elementos.get(i).getCantidadElementos();
        }
        return suma;
    }

    public String toString(){
        String ret = "";
        for(Elemento e : elementos){
            ret += this.getNombre()  + "/ \n" + e.toString() + "\n";
        }
        return ret;
    }

    @Override
    public ArrayList<Archivo> buscarArchvios(Buscador c) {
        ArrayList<Archivo> ret = new ArrayList<>();
        for(Elemento e : elementos){
            ret.addAll(e.buscarArchvios(c));
        }   
        return ret;
    }
    
}
