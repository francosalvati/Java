package FabricaMuebles;

import java.time.LocalDate;

public class PoliticaFecha implements Politica {
    private LocalDate fechaMaxima;

    
    public PoliticaFecha(LocalDate fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }


    @Override
    public boolean cumple(Pedido p) {
        return p.getFechaEntrega().isBefore(fechaMaxima);
    }
    
}
