package ContratoPersonal;

public class CandidatoXEmpresa extends Candidato{

    public CandidatoXEmpresa(String nombre, int sueldo, String empresa) {
        super(nombre, sueldo, empresa);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean exclusividad(Oferta o) {
        return  this.getEmpresa().equals(o.getEmpresa());
        }

}