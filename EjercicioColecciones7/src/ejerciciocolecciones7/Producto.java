package ejerciciocolecciones7;

public class Producto {
    
    private double precio;
    private int cantidad;
    
    public Producto(double precio, int cantidad){
        
      this.precio=precio;
      this.cantidad=cantidad;
      
    }

    public double getPrecio() {
        return precio+(precio*12)/100;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
