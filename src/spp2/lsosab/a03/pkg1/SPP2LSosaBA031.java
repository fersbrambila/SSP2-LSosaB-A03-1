/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lsosab.a03.pkg1;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class SPP2LSosaBA031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de la hipotenusa de un triángulo");
        System.out.println("En este programa se utlizara el método de raíz cuadrada (sqrt) y potencia (pow)");
        
        double a,b,h;
        
        Scanner Teclado= new Scanner (System.in);
        
        
        System.out.println("Introduce la medida del cateto A");
        a= Teclado.nextDouble();
        
        System.out.println("Introduce la medida del cateto B");
        b= Teclado.nextDouble();
        
        
        //Se utlizara el metode de raiz cuadrada y potencia
        
        h= Math.sqrt (Math.pow (a,2) + Math.pow(b,2));
        
        System.out.println("La hipotenusa es igual a " + h);
        
        // TODO code application logic here
    }
    
}
