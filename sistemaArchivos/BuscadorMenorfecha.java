package sistemaArchivos;

import java.time.LocalDate;

public class BuscadorMenorfecha implements Buscador{

    private LocalDate fecha;
    
    public BuscadorMenorfecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(Archivo a) {
        return a.getFechaCreacion().isBefore(fecha);
    }
    
}
