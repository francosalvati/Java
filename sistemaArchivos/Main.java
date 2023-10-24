package sistemaArchivos;

public class Main {
    public static void main(String[]args){
        Archivo parcial1 = new Archivo("parcial dificil", 100.0);
        Archivo parcial2 = new Archivo("parcialFacil", 200.0);
        Archivo archivo3 = new Archivo("Minecraft", 1100.0);
        Archivo archivo4 = new Archivo("League of Legends", 2000.0);
        Carpeta carpeta = new Carpeta("carpeta");
        Carpeta parciales = new Carpeta("parciales");
        Carpeta juegos = new Carpeta("jueguitos");
        carpeta.setElementos(juegos);
        carpeta.setElementos(parciales);
        parciales.setElementos(parcial1);
        parciales.setElementos(parcial2);
        juegos.setElementos(archivo3);
        juegos.setElementos(archivo4);

        System.out.println(carpeta.buscarArchvios(new BuscadorNot(new BuscadorXtamanio(100.1))));
    }
}
