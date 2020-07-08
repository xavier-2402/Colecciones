package ejerciciocolecciones6;


import java.util.ArrayList;
import java.util.Iterator;


public class EjerciicioColecciones6 {

    public static void main(String[] args) {
     
        ArrayList<Persona> cola = new ArrayList<>();
         
        generarCola(cola);
         
        double recaudacion;
        double Total=0;
        Persona espectadorActual;
        int edadactual;
        
        Iterator<Persona> it=cola.iterator();
         
      
        while(it.hasNext()){
             
            espectadorActual=it.next();
             
            edadactual=espectadorActual.getEdad();
             
             if(edadactual>=5 && edadactual<=10){
                recaudacion=1;
              }else if(edadactual>=11 && edadactual<=17){
                  recaudacion=2.5;
              }else{
                  recaudacion=3.5;
              }
            Total+=recaudacion;
             
            System.out.println(" A una persona de "+edadactual+" años se le ha cobrado " +recaudacion+ " euros");
             
        }
         
        //Mostramos el resultado
        System.out.println("El dinero total recaudado es  "+Total+" euros");
         
    }
     
    public static void generarCola(ArrayList<Persona> cola){
             
        int numeroPersonas=(int)(Math.random()*50+1);
         
        for(int i=0;i<numeroPersonas;i++){
            cola.add(new Persona(((int)Math.floor(Math.random()*(60-5))+5)));
        } 
    }
}
     
 
        

