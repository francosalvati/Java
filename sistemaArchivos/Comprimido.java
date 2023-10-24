package sistemaArchivos;



public class Comprimido extends Carpeta{

    private int tasaCompresion;
    public Comprimido(String nombre, int tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }
    public int getTasaCompresion() {
        return tasaCompresion;
    }
    public void setTasaCompresion(int tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio(){
        return super.getTamanio() * tasaCompresion;
    }
}
