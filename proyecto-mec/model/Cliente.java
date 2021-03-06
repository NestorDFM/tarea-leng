/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.model;

/**
 *
 * @author Usuario
 */
public class Cliente {
   //atributos
    private int codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String celular;
    private Double credito;
    private boolean estado;
    private int ciudadCodigo;
    
    //constructores
    //constructores por defecto

    public Cliente() {
        this.codigo = 0;
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.celular="";
        this.credito = 0d;
        this.estado = false;
        this.ciudadCodigo = 0;
    }
    //constructores por parametros

    public Cliente(int codigo, String nombre, String apellido, String direccion, int estado, Double credito, int ciudadCodigo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.estado = false;
        this.credito = credito;
        this.ciudadCodigo=ciudadCodigo;
    }
    //metodo getter y setters

    public Cliente(int codigo, String nombre, String apellido, String direccion, String celular, Double credito, int ciudadCodigo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.celular = celular;
        this.credito = credito;
        this.ciudadCodigo = ciudadCodigo;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCiudadCodigo() {
        return ciudadCodigo;
    }

    public void setCiudadCodigo(int ciudadCodigo) {
        this.ciudadCodigo = ciudadCodigo;
    }

   
    
    
    
    
    
}
