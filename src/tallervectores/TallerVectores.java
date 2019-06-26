
package tallervectores;

import java.util.Scanner;

public class TallerVectores {

    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        
        double estudiantes, listado, promedio, nombre, nota;
        
        //System.out.println("Ingrese la cantidad de estudiantes");
        //estudiantes = leer.nextDouble();
        
        //System.out.println("Ingrese nombre del estudiante");
        //nombre = leer.nextDouble();
        
        System.out.println("Ingrese nota");
        nota = leer.nextDouble();
        
        int i;

        while (true) {          //Condición trivial: siempre cierta

            i++;

            System.out.println ("Valor de i: " + i);

            if (i==9) { break;}

        }
        
    }
    
}
