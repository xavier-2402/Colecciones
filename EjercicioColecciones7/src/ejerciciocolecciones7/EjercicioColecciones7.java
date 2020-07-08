package ejerciciocolecciones7;

import java.util.LinkedList;

public class EjercicioColecciones7 {

    public static void main(String[] args) {
        
        LinkedList<Producto>cola = new LinkedList();
        
        generarproductos(cola);
        String ticket=" ";
        double precioTotal=0;
        Producto productoActual;
        
        System.out.println("Producto    Cantidad   Precio ");
        for(int i=0;!cola.isEmpty();i++){
             
            productoActual=cola.getFirst();
            cola.removeFirst();
            precioTotal+=productoActual.getPrecio();
            ticket+="Producto "+(i+1)+"   "+productoActual.getCantidad()+
                    "    "+productoActual.getPrecio()+"\n";
                   
             
        }
         
        ticket+="Precio Total: "+precioTotal;
         
        System.out.println(ticket);
        
    }
    
    public static void generarproductos(LinkedList<Producto>lista){
        
        int cantidadproductos=(int)((Math.random()*8+1));
        int cantidad;
        double precio;
        
        for(int i=0;i<cantidadproductos;i++){
            cantidad=(int)((Math.random()*8+1));
            precio=((double)Math.floor(Math.random()*10+5));
           lista.addLast(new Producto(cantidad,(int) precio));
            
            
        }
    }
}
