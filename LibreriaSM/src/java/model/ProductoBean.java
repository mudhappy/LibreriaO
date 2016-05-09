
package model;

public class ProductoBean {
    private int idprod;
    private int idcat;
    private int idmar;
    private String nombre;
    private double preciocompra;
    private double precioventa;
    private int stock;
    private int idima;

    public ProductoBean(int idprod, int idcat, int idmar, String nombre, double preciocompra, double precioventa, int stock, int idima) {
        this.idprod = idprod;
        this.idcat = idcat;
        this.idmar = idmar;
        this.nombre = nombre;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
        this.idima= idima;
    }
  

   
    public ProductoBean() {
    }
    

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public int getIdmar() {
        return idmar;
    }

    public void setIdmar(int idmar) {
        this.idmar = idmar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public int getIdima() {
        return idima;
    }

    public void setIdima(int idima) {
        this.idima = idima;
    }
    
    
    
}
