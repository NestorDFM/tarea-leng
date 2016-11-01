/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Ciudad;
import py.edu.facitec.mec.model.Cliente;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author User
 */
public class CiudadDaoImpl implements CiudadDao{

    @Override
    public void insertarCiudad(Ciudad ciudad) {
        String sql = "INSERT INTO ciudades(nombre, iso, estado)"
        + " VALUES ('"+ciudad.getNombre()+"', '"+ciudad.getIso()+"','"+ciudad.getEstado()+"' )";
      
        ConexionManager.conectar();
        try {
         
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
    }

    @Override
    public Ciudad consultarCiudad(int codigo) {
        String sql="select nombre, iso from ciudades where codigo = "+codigo+" ";
        
        Ciudad ciudad= null;
        ConexionManager.conectar();
        
        try {
            ResultSet rs = ConexionManager.stm.executeQuery(sql);
            
            if(rs.next()){
                ciudad= new Ciudad();
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setIso(rs.getString("iso"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
        
        return ciudad;
    }

    @Override
    public boolean modificarCiudad(Ciudad ciudad) {
       String sql="Update ciudades set nombre='"+ciudad.getNombre()+"', "
              + "iso='"+ciudad.getIso()+"' where codigo= "+ciudad.getCodigo()+" ";
      
      boolean resultado=false;
      
      ConexionManager.conectar();
      
        try {
            resultado = ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      ConexionManager.desconectar();
      
      return resultado;
    }

    @Override
    public void eliminar(int codigo) {
        String sql ="Delete from ciudades where codigo="+codigo+" ";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
    }
    
}
