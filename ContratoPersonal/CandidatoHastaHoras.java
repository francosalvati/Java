package ContratoPersonal;

public class CandidatoHastaHoras extends Candidato {
    private int horas;
    public CandidatoHastaHoras(String nombre, int sueldo, String empresa, int horas) {
        super(nombre, sueldo, empresa);
        this.horas = horas;
    }

    @Override
    public boolean exclusividad(Oferta o) {
        return o.getHorasDedicadas() < horas;
    }
    
}
