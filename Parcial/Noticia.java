package Parcial;

import java.util.ArrayList;

public class Noticia extends ElementoNoticia implements Comparable<Noticia>{
    private String contenido;
    private String titulo;
    private String autor;
    private String categoria;
    private ArrayList<String> palabrasClaves;

    public Noticia(String contenido, String titulo, String autor, String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabrasClaves = new ArrayList<>();
    }

    public String getContenido() {
        return contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String>(palabrasClaves);
    }

    public void setPalabrasClaves(String pc) {
        if (!palabrasClaves.contains(pc))
            this.palabrasClaves.add(pc);
    }

    @Override
    public ArrayList<Noticia> buscar(Filtro f) {
        ArrayList<Noticia> ret = new ArrayList<>();
        if(f.cumple(this))
            ret.add(this);
        return ret;
    }

    @Override
    public int compareTo(Noticia o) {
        return o.getTitulo().compareTo(this.getTitulo());
    }

    public String toString(){
        return this.getTitulo() +" categoria: "+this.getCategoria() + "\n";
    }
}
