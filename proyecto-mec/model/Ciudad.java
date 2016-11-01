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
//atributos
public class Ciudad {
    private int codigo;
    private String nombre;
    private String iso;
    private boolean estado;
    
    //constructores
    //constructores por defecto

    public Ciudad() {
        this.codigo = 0;
        this.nombre = "";
        this.iso = "";
        this.estado = false;
    }
    //constructor por parametro

    public Ciudad(int codigo, String nombre, String iso, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.iso = iso;
        this.estado = estado;
    }
    //metodo getter y setter

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

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
