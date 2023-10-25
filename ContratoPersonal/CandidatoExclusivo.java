package ContratoPersonal;

public class CandidatoExclusivo extends Candidato{

    public CandidatoExclusivo(String nombre, int sueldo, String empresa) {
        super(nombre, sueldo, empresa);
    }

    @Override
    public boolean exclusividad(Oferta o) {
        return false;
        }
    
}
