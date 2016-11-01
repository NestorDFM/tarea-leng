/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.model;

/**
 *
 * @author User
 */
public class MantenimientoDetalle {
    
    private int codigo;
    private int mantenimientoCodigo;
    private int servicioCodigo;
    private Double cantidad;
    private Double precio;
    private Double subtotal;

    public MantenimientoDetalle() {
        codigo=0;
        cantidad=0d;
        precio=0d;
        subtotal=0d;
    }

    public MantenimientoDetalle(int codigo, Double cantidad, Double precio, Double subtotal) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getSubtotal() {
        
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        
        this.subtotal = subtotal;
    }

    public int getMantenimientoCodigo() {
        return mantenimientoCodigo;
    }

    public void setMantenimientoCodigo(int mantenimientoCodigo) {
        this.mantenimientoCodigo = mantenimientoCodigo;
    }

    public int getServicioCodigo() {
        return servicioCodigo;
    }

    public void setServicioCodigo(int servicioCodigo) {
        this.servicioCodigo = servicioCodigo;
    }
    
    
    
}
