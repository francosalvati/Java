package tp5_agricultores;

public class Pastura extends Cereal{
    
    Pastura (String nombre){
        super(nombre);
    }

    public String toString(){
        return "el nombre es: " +super.getNombre()+ "y tiene minerales: "+ super.getMinerales();
    }
}
