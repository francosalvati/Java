package Parcial;

import java.util.ArrayList;

public abstract class ElementoNoticia{
    
    public abstract ArrayList<String> getPalabrasClaves();
    public abstract String getCategoria();
    public abstract ArrayList<Noticia> buscar(Filtro f);
}
