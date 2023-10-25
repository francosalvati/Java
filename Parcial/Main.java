package Parcial;

public class Main {
    public static void main(String [] args){
        Noticia noticia1 = new Noticia("el contenido de la pagina es este", "soy un titulo", "yo", "accion");
        Noticia noticia2 = new Noticia("murio ricardito iorio", "ricardo el peroncho", "vorterix", "falopa");
        Noticia noticia3 = new Noticia("no se que poner", "titulo", "a", "jueguito");
        Noticia noticia4 = new Noticia("el jueves hay parcial", "parcial", "yo", "facu");
        Noticia noticia5 = new Noticia("el jueves se aprueba nazii", "parcial", "yo", "oscopo");
        Noticia noticia6 = new Noticia("el  es este", "nose que soy un titulo", "yo", "accion");
        Noticia noticia7 = new Noticia("el contenido  es este", "nunca fui un titulo", "yo", "accion");
        Noticia noticia8 = new Noticia("de la pagina es este", "solo de ves en cuando soy un titulo", "yo", "accion");
        Noticia noticia9 = new Noticia("el contenido de la pagina es este", "aveces soy un titulo", "yo", "accion");
        Noticia noticia10 = new Noticia("el contenido", "no soy un titulo", "yo", "accion");
        Noticia noticia11 = new Noticia("el contenido es no se cual es", "no titulo", "yo", "accion");

        Estructura grupoA = new Estructura(5, "sin definir");
        Estructura grupoB = new Estructura(5, "sin definir");
        grupoA.setElementos(noticia1);
        grupoA.setElementos(noticia2);
        grupoA.setElementos(noticia3);
        grupoA.setElementos(noticia4);
        grupoA.setElementos(noticia5);
        grupoB.setElementos(noticia6);
        grupoB.setElementos(noticia7);
        grupoB.setElementos(noticia8);
        grupoB.setElementos(noticia9);
        grupoB.setElementos(grupoA);
        System.out.println(grupoB.buscarConOrdenanzas(new FiltroXcontenido("a"), new ComparadorCategoria()));
    }
}
