package ContratoPersonal;

public class Main {
    public static void main(String[]args){
        Candidato pepe = new CandidatoXsueldo("pepe", 110, "apple");
        Candidato juan = new CandidatoExclusivo("juan", 1230, "google");
        Candidato carlo = new CandidatoHastaHoras("juan", 1230, "google", 10);
        Consultora laLaburadora = new Consultora();
        laLaburadora.setCandidatos(juan);
        laLaburadora.setCandidatos(pepe);
        laLaburadora.setCandidatos(carlo);

        System.out.println(laLaburadora.buscarCandidatos(new Oferta("algo", 100, 3)));

    }
}
