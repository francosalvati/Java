package Viajes;

import java.time.LocalDate;

public class PaqueteDescuento extends PaqueteSimple{
    
    private double descuento;
    private LocalDate f1, f2;


    public PaqueteDescuento(int id, int nPasajeros, LocalDate fechadePago, String ciudadOrigen, String ciudadDestino,
            double costo, String datosAlojamiento, double descuento, LocalDate f1, LocalDate f2) {
        super(id, nPasajeros, fechadePago, ciudadOrigen, ciudadDestino, costo, datosAlojamiento);
        this.descuento = descuento;
        this.f1 = f1;
        this.f2 = f2;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    @Override
    public double getCosto(){
        if(this.getFechadePago() != null && this.getFechadePago().isAfter(this.getF1()) && this.getFechadePago().isBefore(this.getF2()))
        return super.getCosto() * descuento;
        else
        return super.getCosto();
    }

    public LocalDate getF1() {
        return f1;
    }

    public void setF1(LocalDate f1) {
        this.f1 = f1;
    }

    public LocalDate getF2() {
        return f2;
    }

    public void setF2(LocalDate f2) {
        this.f2 = f2;
    }

}
