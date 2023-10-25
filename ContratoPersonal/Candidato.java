package ContratoPersonal;

public abstract class Candidato {
    private String nombre;
    private int sueldo;
    private String empresa;
    public String getNombre() {
        return nombre;
    }
    public int getSueldo() {
        return sueldo;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public Candidato(String nombre, int sueldo, String empresa) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public abstract boolean exclusividad(Oferta o);
    
    public String toString(){
        return this.getNombre();
    }
}
