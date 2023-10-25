package ContratoPersonal;

public class Oferta {
    private String empresa;
    private int sueldo;
    private int horasDedicadas;
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public int getHorasDedicadas() {
        return horasDedicadas;
    }
    public void setHorasDedicadas(int horasDedicadas) {
        this.horasDedicadas = horasDedicadas;
    }
    public Oferta(String empresa, int sueldo, int horasDedicadas) {
        this.empresa = empresa;
        this.sueldo = sueldo;
        this.horasDedicadas = horasDedicadas;
    }
    
}
