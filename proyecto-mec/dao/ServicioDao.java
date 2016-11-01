/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import py.edu.facitec.mec.model.Servicio;

/**
 *
 * @author User
 */
public interface ServicioDao {
    void insertarServicio(Servicio servicio);
    boolean modificar(Servicio servicio);
    Servicio consultar(int codigo);
    void eliminar(int codigo);
}
