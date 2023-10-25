package ContratoPersonal;

public class CandidatoXsueldo extends Candidato {

    public CandidatoXsueldo(String nombre, int sueldo, String empresa) {
        super(nombre, sueldo, empresa);
    }

    @Override
    public boolean exclusividad(Oferta o) {
        return !(this.getSueldo() < o.getSueldo());
    }
    
}
