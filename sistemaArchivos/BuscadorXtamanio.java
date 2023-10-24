package sistemaArchivos;

public class BuscadorXtamanio implements Buscador {
    private double tamanio;

    public BuscadorXtamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public boolean cumple(Archivo a) {
        return a.getTamanio() < tamanio;
    }

}
