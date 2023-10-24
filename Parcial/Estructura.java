package Parcial;

import java.util.ArrayList;

public class Estructura {
    
    private ArrayList<Noticia> noticias;
    private int posicion;
    

    public Estructura(int posicion) {
        this.posicion = posicion;
        this.noticias = new ArrayList<>();
    }


    public int getPosicion() {
        return posicion;
    }


    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }



    public ArrayList<String> getPalabrasClaves(){
        ArrayList<String> ret = new ArrayList<>();
        for(Noticia n: noticias){
            ret.addAll(n.getPalabrasClaves());
        }
        return ret;
    }
}
