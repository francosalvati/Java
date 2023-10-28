package FabricaMuebles;

import java.time.LocalDate;

public class Main {
    public static void main (String[]args){
        CadenaDeFabrica maltise = new CadenaDeFabrica();
        Fabrica fabrica1 = new Fabrica(new PoliticaMaterial("estilo escandinavo"));
        Fabrica fabrica5 = new Fabrica(new PoliticaMaterial("estilo escandinavo"));
        Fabrica fabrica6 = new Fabrica(new PoliticaMaterial("estilo escandinavo"));
        Fabrica fabrica8 = new Fabrica(new PoliticaMaterial("estilo escandinavo"));
        Fabrica fabrica2 = new Fabrica(new PoliticaMaterial("madera"));
        Fabrica fabrica3 = new Fabrica(new PoliticaMaterial("marmol"));
        Fabrica fabrica4 = new Fabrica(new PoliticaMaterial("algo"));
        Pedido pedido1 = new Pedido("madera", 10, LocalDate.now(), 10);
        Pedido pedido2 = new Pedido("marmol", 10, LocalDate.now(), 10);
        Pedido pedido3 = new Pedido("madera", 10, LocalDate.now(), 10);
        Pedido pedido4 = new Pedido("piedra", 10, LocalDate.now(), 10);

        maltise.setFabricas(fabrica1);
        maltise.setFabricas(fabrica8);
        maltise.setFabricas(fabrica6);
        maltise.setFabricas(fabrica5);
        maltise.setFabricas(fabrica4);
        maltise.setFabricas(fabrica3);
        maltise.setFabricas(fabrica2);
        maltise.setPedidoenFabrica(pedido4);
        maltise.setPedidoenFabrica(pedido2);
        maltise.setPedidoenFabrica(pedido3);
        maltise.setPedidoenFabrica(pedido1);

        System.out.println(maltise);
        System.out.print("null");
    }
}
