/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparablelab;

public class Alumno extends Persona implements Comparable<Alumno> {
    
    private String codigoAlumno;
    private String nivelAcademico;
    private float nparcial;
    private float nfinal;
    
    
    public Alumno(String nombre, int edad, String ca, String na, float np, float nf){
        
        super(nombre, edad);
        this.codigoAlumno = ca;
        this.nivelAcademico = na;
        this.nparcial = np;
        this.nfinal = nf;
        
    }
    public float promedio(){
        float prom = (nparcial+nfinal)/2;
        return prom;
    }
    
        public String toString(){
        return super.toString()+"\nCodigo: "+codigoAlumno+"\nNivel Academico: "+nivelAcademico+
                "\nNota Parcial: "+nparcial+"\nNota Final: "+nfinal+"\nPromedio: "+promedio();   
    }
        
    public int compareTo(Alumno otro){
        if(this.promedio() < otro.promedio())
            return -1;
        if(this.promedio() > otro.promedio())
            return 1;
        return 0;
    }
}
