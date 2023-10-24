package tp5_agricultores;

public class Principial {
    public static void main(String[]args){
        Pastura nuevaPastura = new Pastura("alfalfa");
        nuevaPastura.addMineral("calcio");
        nuevaPastura.addMineral("magnesio");
        nuevaPastura.addMineral("fosforo");

        System.out.println(nuevaPastura);
    }
}
