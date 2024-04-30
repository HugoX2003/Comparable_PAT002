
package comparablelab;

public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String n, int e){
        
        nombre = n;
        edad = e;
        
    }
    
    public String toString(){
        
        return("Nombre: "+nombre+"\nEdad: "+edad);
    }
    
}
