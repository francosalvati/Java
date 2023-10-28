package Viajes;

public class FIltroXDestino implements Filtro{
    private String destino;

    public FIltroXDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public boolean cumple(Paquete p) {
        return this.destino.equals(p.getCiudadDestino());
    }
    

}
