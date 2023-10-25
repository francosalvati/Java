package Parcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Estructura  extends ElementoNoticia{
    
    private ArrayList<ElementoNoticia> elementos;
    private int posicion;
    private String defaul;

    public Estructura(int posicion, String defaul) {
        this.posicion = posicion;
        this.elementos = new ArrayList<>();
        this.defaul = defaul;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public ArrayList<String> getPalabrasClaves(){
        ArrayList<String> ret = new ArrayList<>();
        for(ElementoNoticia n: elementos){
            ret.addAll(n.getPalabrasClaves());
        }
        return ret;
    }

    public void setElementos(ElementoNoticia elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public ArrayList<Noticia> buscar(Filtro f) {
        ArrayList<Noticia> ret = new ArrayList<>();
        for (ElementoNoticia n : elementos){
            ret.addAll(n.buscar(f));
        }
        Collections.sort(ret);
        return ret;
    }
    public ArrayList<Noticia> buscarConOrdenanzas(Filtro f, Comparator c) {
        ArrayList<Noticia> ret = new ArrayList<>();
        for (ElementoNoticia n : elementos){
            ret.addAll(n.buscar(f));
        }
        Collections.sort(ret, c);
        return ret;
    }

    public String getCategoria(){  
        if(elementos.size() > posicion - 1){
            defaul = elementos.get(posicion -1).getCategoria();
        }
        return defaul;
    }
}
