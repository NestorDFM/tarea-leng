/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.model;

import java.util.Date;

/**
 *
 * @author User
 */
public class Mantenimiento {
    
    private int codigo;
    private String fecha;
    private int clienteCodigo;
    private String condicion;
    private Double importeTotal;
    private String observacion;
    private String situacion;

    public Mantenimiento() {
        codigo=0;
        fecha="";
        condicion="";
        importeTotal=0d;
        observacion="";
        situacion="";
    }

    public Mantenimiento(int codigo, Date fecha, String condicion, Double importeTotal, String observacion, String situacion) {
        this.codigo = codigo;
        this.fecha = "";
        this.condicion = condicion;
        this.importeTotal = importeTotal;
        this.observacion = observacion;
        this.situacion = situacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public int getClienteCodigo() {
        return clienteCodigo;
    }

    public void setClienteCodigo(int clienteCodigo) {
        this.clienteCodigo = clienteCodigo;
    }
    
    
    
}
