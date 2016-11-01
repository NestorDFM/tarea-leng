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
import py.edu.facitec.mec.model.Servicio;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author User
 */
public class ServicioDaoImpl implements ServicioDao{

    @Override
    public void insertarServicio(Servicio servicio) {
        String sql ="insert into servicios( nombre, descripcion, valor_unitario, estado) "
                + "values('"+servicio.getNombre()+"', '"+servicio.getDescripcion()+"',"
                + " "+servicio.getValorUnitario()+", "+servicio.getEstado()+" )";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
    }

    @Override
    public boolean modificar(Servicio servicio) {
        String sql="update servicios set nombre='"+servicio.getNombre()+"', descripcion='"+servicio.getDescripcion()+"',"
                + " valor_unitario="+servicio.getValorUnitario()+" where codigo="+servicio.getCodigo()+" ";
         boolean resultado=false;
        ConexionManager.conectar();
        
        try {
            resultado = ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
        return resultado;
    }

    @Override
    public Servicio consultar(int codigo) {
       String sql="select nombre, descripcion, valor_unitario from servicios where codigo="+codigo+" ";
       
       Servicio servicio=null;
       
       ConexionManager.conectar();
       
        try {
            
            ResultSet rs = ConexionManager.stm.executeQuery(sql);
            
            if(rs.next()){
                servicio= new Servicio();
                servicio.setNombre(rs.getString("nombre"));
                servicio.setDescripcion(rs.getString("descripcion"));
                servicio.setValorUnitario(rs.getDouble("valor_unitario"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
       return servicio;
    }

    @Override
    public void eliminar(int codigo) {
         String sql="Delete from servicios where codigo="+codigo+" ";
         
         ConexionManager.conectar();
         
        try {
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         ConexionManager.desconectar();
    }
    
}
