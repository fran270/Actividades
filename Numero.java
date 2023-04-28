/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero;
import java.util.Scanner;
/**
 *
 * @author alumnado
 */
public class Numero {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int numero;
       
       System.out.println("Introduce un numero: ");
       numero = s.nextInt();
       
       if(numero>0){
           System.out.println("El numero es positivo");
       }else{
           System.out.println("El numero es negativo");
       }
    }
    
}
