/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Cliente;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author Usuario
 */
//string '"++"'
//numerico, fecha "++"
public class ClienteDaoImpl implements ClienteDao {

    public void guardar(Cliente cliente) {
        String sql = "INSERT INTO clientes(nombres, apellidos, direccion, celular, credito, estado, ciudad_codigo)"//hasta maximo hasta 110 nomenclatura
        + " VALUES ('"+cliente.getNombre()+"', '"+cliente.getApellido()+"','"+cliente.getDireccion()+"', "
                +"'"+cliente.getCelular()+"', "+cliente.getCredito()+", "+cliente.getEstado()+", "+cliente.getCiudadCodigo()+" )";
      
        System.out.println("SQL" +sql);
        //abrir una conexion
        ConexionManager.conectar();
        try {
         //ejecutar el sql
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        //cerrar la conexion
        ConexionManager.desconectar();
    }

    @Override
    public Cliente buscarPorCodigo(int codigo) {
        String sql="select nombres, apellidos, direccion, celular, credito, ciudad_codigo from clientes where codigo = "+codigo+" ";
        
        Cliente cliente = null;
        ConexionManager.conectar();
        
        try {
            ResultSet rs = ConexionManager.stm.executeQuery(sql);
            
            if(rs.next()){//si tuvo resultado el sql
                cliente= new Cliente();//instanciar
                cliente.setNombre(rs.getString("nombres"));//setear los valores a los atributos
                cliente.setApellido(rs.getString("apellidos"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCredito(rs.getDouble("credito"));
                cliente.setCiudadCodigo(rs.getInt("ciudad_codigo"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
        
        return cliente;
        
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
      String sql="Update clientes set nombres='"+cliente.getNombre()+"', "
              + "apellidos='"+cliente.getApellido()+"', direccion='"+cliente.getDireccion()+"', celular='"+cliente.getCelular()+"',credito="+cliente.getCredito()+", ciudad_codigo="+cliente.getCiudadCodigo()+" where codigo= "+cliente.getCodigo()+" ";
      
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
        String sql ="Delete from clientes where codigo="+codigo+" ";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
    }

    @Override //GENERIC <>
    public List<Cliente> buscarClientePorFiltro(String filtro) {
        String sql="select codigo, nombres, apellidos, direccion, celular from clientes "
                + "where nombres LIKE '%"+filtro+"' or apellidos LIKE '"+filtro+"%' "
                + "or direccion LIKE '%"+filtro+"%' or celular LIKE '%"+filtro+"' ";
        
        List<Cliente> lista = new ArrayList<>();
        
        ConexionManager.conectar();
        
        try {
            ResultSet rs = ConexionManager.stm.executeQuery(sql);
            
            if(rs.next()){
                Cliente c = new Cliente();
                c.setCodigo(rs.getInt("codigo"));
                c.setNombre(rs.getString("nombres"));
                c.setApellido(rs.getString("apellidos"));
                c.setDireccion(rs.getString("direccion"));
                c.setCelular(rs.getString("celular"));
                //c.setCredito(rs.getDouble("credito"));
               
                lista.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
        
        return lista;
    }

    @Override
    public List<Cliente> buscarClienteEnTabla(int codigo) {
       String sql="select codigo, nombres, apellidos, direccion, celular from clientes where codigo = "+codigo+" ";
        
        List<Cliente> lista = new ArrayList<>();
        
        ConexionManager.conectar();
        Cliente c=null;
        try {
            ResultSet rs = ConexionManager.stm.executeQuery(sql);
            
            if(rs.next()){
                c = new Cliente();
                 c.setCodigo(rs.getInt("codigo"));
                c.setNombre(rs.getString("nombres"));
                c.setApellido(rs.getString("apellidos"));
                c.setDireccion(rs.getString("direccion"));
                c.setCelular(rs.getString("celular"));
               
                lista.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
        
        return lista;
    }
    
    
}
