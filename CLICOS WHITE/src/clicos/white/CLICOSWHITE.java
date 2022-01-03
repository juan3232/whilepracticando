
package clicos.white;

import java.util.Scanner;

public class CLICOSWHITE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
        
        int i=10,contador;
        
        System.out.println("Digite cuantos  numeros quiere    en la pantalla:");
        contador=entrada.nextInt();
        
        while (i<=contador){
            System.out.println(i);
            i++;
        }
       
    }
    
}
