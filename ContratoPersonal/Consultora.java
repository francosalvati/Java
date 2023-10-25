package ContratoPersonal;

import java.util.ArrayList;

public class Consultora {
    private ArrayList<Candidato> candidatos;

    
    public Consultora() {
        candidatos= new ArrayList<>();
    }

    

    public ArrayList<Candidato> buscarCandidatos(Oferta o){
        ArrayList<Candidato> ret = new ArrayList<>();
        for(Candidato c: candidatos){
            if(c.exclusividad(o))
                ret.add(c);
        }
        return ret;
        
    }



    public ArrayList<Candidato> getCandidatos() {
        return new ArrayList<>(candidatos);
    }



    public void setCandidatos(Candidato c) {
        if(!candidatos.contains(c))
            candidatos.add(c);
    }
}
