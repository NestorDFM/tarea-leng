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
public class Servicio {
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private Double valorUnitario;
    private boolean estado;

    public Servicio() {
        codigo=0;
        nombre="";
        valorUnitario=0d;
        estado=false;
    }

    public Servicio(int codigo, String nombre, Double valorUnitario, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}
