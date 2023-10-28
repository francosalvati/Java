package Viajes;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaqueteSimple extends Paquete{
    
    private LocalDate fechadePago;
    private String ciudadOrigen, ciudadDestino;
    private double costo;
    private String datosAlojamiento;
    
    public PaqueteSimple(int id, int nPasajeros, LocalDate fechadePago, String ciudadOrigen, String ciudadDestino,
            double costo, String datosAlojamiento) {
        super(id, nPasajeros);
        this.fechadePago = fechadePago;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.costo = costo;
        this.datosAlojamiento = datosAlojamiento;
    }

    public LocalDate getFechadePago() {
        return fechadePago;
    }

    public void setFechadePago(LocalDate fechadePago) {
        this.fechadePago = fechadePago;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDatosAlojamiento() {
        return datosAlojamiento;
    }

    public void setDatosAlojamiento(String datosAlojamiento) {
        this.datosAlojamiento = datosAlojamiento;
    }


    @Override
    public ArrayList<Paquete> buscarPaquete(Filtro f) {
        ArrayList<Paquete> ret = new ArrayList<>();
        if(f.cumple(this))
            ret.add(this);
        return  ret ;
    }



    

}
