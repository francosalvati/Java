package Parcial;

public class FiltroOr implements Filtro{
    private Filtro f1, f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Noticia n) {
        return this.f1.cumple(n) || this.f2.cumple(n);
    }
}
