package ejerciiciocolecciones5;


import java.util.LinkedList;

public class EjerciicioColecciones5 {

    public static void main(String[] args) {
        LinkedList<Persona> cola = new LinkedList<>();
         
        generarCola(cola);
         
        double recaudacion;
        double Total=0;
        Persona personaactual;
        int edadactual;
        int i=0;
        
       
   
      while(!cola.isEmpty()){
            personaactual=cola.getFirst();
            cola.removeFirst();
            edadactual=personaactual.getEdad();
            
             
           if(edadactual>=5 && edadactual<=10){
                recaudacion=1;
              }else if(edadactual>=11 && edadactual<=17){
                  recaudacion=2.5;
              }else{
                  recaudacion=3.5;
              }
             
            Total+=recaudacion;
             
            System.out.println("Una persona de "+edadactual+" años se le ha cobrado " +recaudacion+ " euros");
             
        }
         
  
        System.out.println("El dinero total generado es de: "+Total+" euros");
        
      }
     
     
    public static void generarCola(LinkedList<Persona> cola){
             
        int numeroPersonas=((int)Math.floor(Math.random()*(50))+1);
         
        for(int i=0;i<numeroPersonas;i++){
            cola.add(new Persona(((int)Math.floor(Math.random()*(60-5))+5)));
        } 
    }
     
 
        
}
