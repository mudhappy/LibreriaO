/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.InsertDao;

/**
 *
 * @author Windows7
 */
public class EmpleadoService {
    private InsertDao dao;

    public EmpleadoService() {
        dao= new InsertDao();
    }
    public void addCargo(String nombre){
        dao.addCargo(nombre);
    }
    public void addEmpleado(String nombre, String dni, String apellidopa, String apellidoma,
            int idcar, String email, String telefono, String celular, String usuario, String clave){
        
        dao.addEmpleado(nombre, dni, apellidopa, apellidoma, idcar, email, telefono, celular, usuario, clave);
    }
    
}
