/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materiasdificiles;


import java.util.Random;

/**
 *
 * @author utku36
 */
public class MateriasDificiles extends MetodosSteve {
    private static Object scan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Random rand = new Random();
       
       int recorredorMaterias=0;
       int recorredorAlumnos=0;
       int cantidadAlumnos=0;
       
       System.out.print ("Ingrese la cantidad de alumnos del curso");
       cantidadAlumnos = tomarInt();
               
       int [][] matrizNueva = new int[4][cantidadAlumnos];
       //matematicas leguas geo y historia
       
        for (recorredorMaterias = 0; recorredorMaterias < 4; recorredorMaterias++) {
            
            for (recorredorAlumnos = 0; recorredorAlumnos < cantidadAlumnos; recorredorAlumnos++) {
                
                int nota=rand.nextInt(9)+1;
                matrizNueva[recorredorMaterias][recorredorAlumnos]=nota;
                
                System.out.print (matrizNueva[recorredorMaterias][recorredorAlumnos]);
            }
            
        }
        
        
        
    }
    
}
