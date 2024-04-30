
package comparablelab;

import java.util.Arrays;

public class ComparableLab {

    public static void main(String[] args) {
        Alumno []alumnos = new Alumno[3];
        alumnos[0] = new Alumno("Felipe Li", 17, "ab534", "Bachiller", 11, 13);
        alumnos[1] = new Alumno("Juan Lopez", 18, "ab0582", "Bachiller", 12, 16);
        alumnos[2] = new Alumno("Bruno Perez", 16, "ab632", "Bachiller", 10, 8);
        
        System.out.println("ANTES DEL ORDENAMIENTO\n");
        for(int i=0; i<alumnos.length; i++)
            System.out.println(alumnos[i]);
        Arrays.sort(alumnos);
        
        System.out.println("\nDESPUES DEL ORDENAMIENTO\n");
        for(int i=0; i<alumnos.length; i++)
            System.out.println(alumnos[i]);
    }

}
