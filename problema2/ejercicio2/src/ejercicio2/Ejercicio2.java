/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*  Solución que imprima el costo de un pedido de un artículo del cual 
            se tiene la descripción, la cantidad que se requiere y el precio 
            unitario. Si la cantidad pedida excede de 50 unidades, se hace un 
            descuento de 15%.  */
        
        Scanner entrada = new Scanner(System.in); 
       entrada.useLocale(Locale.US);
   
    double cantidadRequerida;
    double precioUnitario;
    double valorTotal;
    double descuento;
    double porcentaje = 15; 
    String datos_Articulo;  
    
    
    System.out.println("Ingrese el nombre del Articulo");
    datos_Articulo = entrada.nextLine();
    
    System.out.println("Ingrese la cantidad requerida");
    cantidadRequerida = entrada.nextDouble();
    
    System.out.println("Ingrese el valor del precio unitario");
    precioUnitario = entrada.nextDouble();
    
    valorTotal = precioUnitario * cantidadRequerida;
    
    if (cantidadRequerida >50){
        descuento =(porcentaje * valorTotal)/100;
        valorTotal = valorTotal - descuento;
    }
    System.out.printf("El valor que debe pagar es %.2f del producto %s" , 
            valorTotal, datos_Articulo);

    }
    
    
}
