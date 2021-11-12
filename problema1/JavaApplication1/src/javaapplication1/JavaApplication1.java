/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAA
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Solución que permita calcular y mostrar el valor a cancelar de una
        planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora 
        y el número de kilovatios consumidos en el mes. Si el usuario 
        tiene edad mayor a 65 años, se debe descontrar el 10%. */
        
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        double costoKilovatio;
        double numeroKilovatio;        
        int edad;
        double descuento;
        double valorTotal;
        double porcentaje;
        porcentaje = 10;
        
        System.out.println("ingrese el costo por costoKilovatio");
        costoKilovatio = entrada.nextDouble();
        
        System.out.println("ingrese el numeroKilovatios");
        numeroKilovatio = entrada.nextDouble();
        
        System.out.println("ingrese su edad");
        edad = entrada.nextInt();
       
        
        valorTotal = costoKilovatio * numeroKilovatio;
        
        if (edad >65){
            
            descuento = (porcentaje * valorTotal);
            valorTotal = valorTotal - descuento;
         
        }            
        
        System.out.printf("el valor a pagar es:" + "%.2f/n",
                valorTotal);
        
        
    }
    
}
