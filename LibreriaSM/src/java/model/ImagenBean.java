/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Windows7
 */
public class ImagenBean {
    private int idima;
    private String nombre;

    public ImagenBean(int idima, String nombre) {
        this.idima = idima;
        this.nombre = nombre;
    }

    public ImagenBean() {
    }
    
    public int getIdima() {
        return idima;
    }

    public void setIdima(int idima) {
        this.idima = idima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
