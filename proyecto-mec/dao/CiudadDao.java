/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import py.edu.facitec.mec.model.Ciudad;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author User
 */
public interface CiudadDao {
    
    public void insertarCiudad(Ciudad ciudad);
    public Ciudad consultarCiudad(int codigo);
    boolean modificarCiudad(Ciudad ciudad);
    void eliminar(int codigo);
}
