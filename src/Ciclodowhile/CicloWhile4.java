/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloWhile;

/**
 *
 * @author COMPUMARS
 */
public class CicloWhile4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 5;
        int contador = 1;
        int suma = 0; 
        String mensajeFinal = "";
        
        //System.out.printf("la", "La suma de:\n"):
        mensajeFinal = String.format("%s%s\n", mensajeFinal, "La suma de");
        while (contador <=limite){
            mensajeFinal = String.format("%s%d\n", mensajeFinal, contador);
            suma = suma + contador;
            //System.out.printf("contador %d\n",contador);
            contador = contador + 1;
        }
        mensajeFinal = String.format("%stiene un resultado de: %d\n", 
                mensajeFinal, suma);
        System.out.printf("%s", mensajeFinal);
        
    }
    
}
