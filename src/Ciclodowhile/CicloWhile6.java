/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclodowhile;

import java.util.Scanner;

/**
 *
 * @author COMPUMARS
 */
public class CicloWhile6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in); 
        
        String nombres; 
        String apellidos; 
        String cadena = null; 
        String valorUsuario;
        int contador = 0;
        int edad = 0;
        int sumaEdades = 0; 
        double promedioEdades = 0;
        boolean bandera = true;   
       
        do{ 
            contador = contador + 1;
            System.out.println("Ingrese sus nombres"); 
            nombres = entrada.nextLine();
            
            System.out.println("Ingrese sus apellidos");
            apellidos = entrada.nextLine();
            
            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
            
            cadena = String.format("%s%s %s edad %d\n", cadena, nombres, 
                    apellidos, edad); 
  
            sumaEdades = sumaEdades + edad;
            entrada.nextLine(); // limpiar el buffer
            System.out.println("Desea salir ingrese 'n'");
            valorUsuario = entrada.nextLine();
            
            if(valorUsuario.equals("n")){ 
                bandera = false;
            }
            
        }while(bandera==true) ;
        
        promedioEdades = (double)sumaEdades/contador;
        cadena = String.format("%sPromedio de edades: %2f\n", cadena,
                promedioEdades);
        
        System.out.printf("%s", cadena); 
        
  
    }}