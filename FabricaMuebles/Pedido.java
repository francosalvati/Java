package FabricaMuebles;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido implements Comparable<Pedido> {
    private String material;
    private ArrayList<String> caracteristicas;
    private int costo;
    private LocalDate FechaEntrega;
    private int precioVenta;

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public ArrayList<String> getCaracteristicas() {
        return new ArrayList<>(caracteristicas);
    }
    public void setCaracteristicas(String c) {
        if(!caracteristicas.contains(c))
            caracteristicas.add(c);
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public LocalDate getFechaEntrega() {
        return FechaEntrega;
    }
    public void setFechaEntrega(LocalDate fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }
    public int getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Pedido(String material, int costo, LocalDate fechaEntrega, int precioVenta) {
        this.material = material;
        this.costo = costo;
        this.FechaEntrega = fechaEntrega;
        this.precioVenta = precioVenta;
        this.caracteristicas = new ArrayList<>();
    }
    @Override
    public int compareTo(Pedido o) {
        return this.getMaterial().compareTo(o.getMaterial());
    }
    
}
