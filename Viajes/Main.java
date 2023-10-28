package Viajes;

public class Main {
    public static void main(String[]args){
        Agencia laGenciana = new Agencia();
        Paquete paquete1 = new PaqueteSimple(0, 02, null, "Chapadmalan", "venecia", 100, "que datitos tengo") ;
        Paquete paquete2 = new PaqueteSimple(1, 4, null, "venecia", "lomas", 10110, "que datitos tengo") ;
        Paquete paquete3 = new PaqueteSimple(2, 6, null, "venecia", "buenos aires", 140, "que datitos tengo") ;
        Paquete paquete4 = new PaqueteSimple(3, 10, null, "buenos aires", "venecia", 200, "que datitos tengo") ;
        Paquete paquete5 = new PaqueteSimple(4, 3, null, "jujuy", "la quiaca", 1001, "que datitos tengo") ;
        Paquete paquete6 = new PaqueteSimple(6, 2, null, "tandil", "mdp", 1100, "que datitos tengo") ;
        PaqueteCompuesto paquete7 = new PaqueteCompuesto(5, 2);

        paquete7.setPaquete(paquete1);
        paquete7.setPaquete(paquete2);
        paquete7.setPaquete(paquete3);
        paquete7.setPaquete(paquete4);
        paquete7.setPaquete(paquete5);
        paquete7.setPaquete(paquete6);

        laGenciana.setPaquetes(paquete7);
        laGenciana.setPaquetes(paquete1);
        laGenciana.setPaquetes(paquete2);
        laGenciana.setPaquetes(paquete3);
        laGenciana.setPaquetes(paquete5);
        laGenciana.setPaquetes(paquete4);
        laGenciana.setPaquetes(paquete6);

        System.out.println("Paquetes destino mdp" + laGenciana.buscar(new FIltroXDestino("venecia"), new ComparadorXId()));
    }
}
