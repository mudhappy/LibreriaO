
package dao;

import db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertDao {
Connection cn=null;    
  public void addCategoria(String nombre){
  
    try {
      cn = AccesoDB.getConnection();
      
      String sql = "insert into categoria(nombre)"
              + "values(?)";
      PreparedStatement pstm = cn.prepareStatement(sql);
     
      pstm.setString(1, nombre);
      pstm.executeUpdate();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  } 
  public void addMarca(String nombre){
     
    try {
      cn = AccesoDB.getConnection();
      
      String sql = "insert into marca(nombre)"
              + "values(?)";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, nombre);
      pstm.executeUpdate();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    } 
  }
  public void addImagen(String nombre){
     
    try {
      cn = AccesoDB.getConnection();
      
      String sql = "insert into imagen(nombre)"
              + "values(?)";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, nombre);
      pstm.executeUpdate();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    } 
  }
  public void addProducto(int idcat,int idmar,String nombre, double preciocompra, double precioventa, int stock, int idima){
   
    try {
      cn = AccesoDB.getConnection();
      
      String sql = "insert into producto(idcat,"
              + "idmar,nombre,preciocompra,precioventa,stock,idima) "
              + "values(?,?,?,?,?,?,?)";
      PreparedStatement pstm = cn.prepareStatement(sql);
     
      pstm.setInt(1, idcat);
      pstm.setInt(2, idmar);
      pstm.setString(3, nombre);
      pstm.setDouble(4, preciocompra);
      pstm.setDouble(5, precioventa);
      pstm.setInt(6, stock);
      pstm.setInt(7, idima);
      pstm.executeUpdate();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }  
  
  public void addCliente(String nombre,String dni,String apellidopa, String apellidoma,
          String email,String telefono,String celular,String usuario,String clave){
     try {
      cn = AccesoDB.getConnection();
      
      String sql = "insert into cliente(nombre,"
              + "dni,apellidopa,apellidoma,email,telefono,celular,usuario,clave,estado) "
              + "values(?,?,?,?,?,?,?)";
      PreparedStatement pstm = cn.prepareStatement(sql);
     
      pstm.setString(1,nombre);
      pstm.setString(2,dni);
      pstm.setString(3,apellidopa);
      pstm.setString(4,apellidoma);
      pstm.setString(5,email);
      pstm.setString(6,telefono);
      pstm.setString(7,celular);
      pstm.setString(8,usuario);
      pstm.setString(9,clave);
      pstm.setInt(10,1);
      pstm.executeUpdate();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    } 
  }
  
  
  public void addCargo(String nombre){
  
    try {
      cn = AccesoDB.getConnection();
      
      String sql = "insert into cargo(nombre)"
              + "values(?)";
      PreparedStatement pstm = cn.prepareStatement(sql);
     
      pstm.setString(1, nombre);
      pstm.executeUpdate();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  } 
  
  
  
  public void addEmpleado(String nombre,String dni,String apellidopa, String apellidoma,int idcar,
          String email,String telefono,String celular,String usuario,String clave){
     try {
      cn = AccesoDB.getConnection();
      
      String sql = "insert into empleado(nombre,"
              + "dni,apellidopa,apellidoma,idcar,email,telefono,celular,usuario,clave,estado) "
              + "values(?,?,?,?,?,?,?,?)";
      PreparedStatement pstm = cn.prepareStatement(sql);
     
      pstm.setString(1,nombre);
      pstm.setString(2,dni);
      pstm.setString(3,apellidopa);
      pstm.setString(4,apellidoma);
      pstm.setInt(5,idcar);
      pstm.setString(6,email);
      pstm.setString(7,telefono);
      pstm.setString(8,celular);
      pstm.setString(9,usuario);
      pstm.setString(10,clave);
      pstm.setInt(11,1);
      pstm.executeUpdate();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    } 
  }
  
 
}
