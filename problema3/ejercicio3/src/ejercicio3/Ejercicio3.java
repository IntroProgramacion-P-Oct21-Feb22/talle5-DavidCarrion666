/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
                to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit
                this template
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* En una hosteria de la ciudad de Loja se hace un descuento del 10% si
           el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10
           días y del 20% si se hospeda más de 15 días. Elaborar un solución que
           pida como datos de entrada el número de días y el precio diario de 
           la habitación y luego calcule e imprima el subtotal por pagar, el 
           descuento y el total por pagar. */
        
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double porcentaje_Japon = 30;
        double impuesto_Japon;

        double porcentaje_Alemania = 20;
        double impuesto_Alemania;

        double porcentaje_Italia = 15;
        double impuesto_Italia;

        double porcentaje_USA = 8;
        double impuesto_USA;

        double precioDe_venta;
        String marca;
        String origen;
        double costo;
        

        System.out.println("Ingrese el origen");
        origen = entrada.nextLine();
        
        System.out.println("Ingrese la marca");
        marca = entrada.nextLine();

        System.out.println("Ingrese el costo");
        costo = entrada.nextDouble();

        
        if (costo <= 0) {
            System.out.println("El valor no es valido");
        } else {
            if (origen.equals("Alemania")) {
                impuesto_Alemania = (costo * porcentaje_Alemania) / 100;
                precioDe_venta = impuesto_Alemania + costo;
                
                System.out.printf("El impuesto a pagar es de: %.2f\n"
                        + "El precio de venta total es de: %.2f\n",
                        impuesto_Alemania, precioDe_venta);
            } else {
                if (origen.equals("Japon")) {
                    impuesto_Japon = (costo * porcentaje_Japon) / 100;
                    precioDe_venta = impuesto_Japon + costo;
                    System.out.printf("El impuesto a pagar es de: %.2f\n"
                            + "El precio de venta total es de: %.2f\n",
                            impuesto_Japon, precioDe_venta);
                } else {
                    if (origen.equals("Italia")) {
                        impuesto_Italia = (costo * porcentaje_Italia) / 100;
                        precioDe_venta = impuesto_Italia + costo;
                        System.out.printf("El impuesto a pagar es de: %.2f\n"
                                + "El precio de venta total es de: %.2f\n", 
                                impuesto_Italia, precioDe_venta);
                    } else {
                        if (origen.equals("Estados Unidos")) {
                            impuesto_USA = (costo * porcentaje_USA) / 100;
                            precioDe_venta = impuesto_USA + costo;
                            System.out.printf("El impuesto a pagar es de: %.2f\n"
                                    + "El precio de venta total es de: %.2f\n", 
                                    impuesto_USA, precioDe_venta);
                        } else {
                            System.out.printf("No necesita pagar impuestos\n"
                                    + "El precio de venta total es de: %.2f\n",
                                    costo);
                        }
                    }
                }
            }
        }
    }

}
   
    

