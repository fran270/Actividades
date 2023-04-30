/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;
import java.util.Scanner;
/**
 *
 * @author Fran Crespo Crespo
 */
public class Operaciones {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int numero1;
       int numero2;
       int suma;
       int resta;
       int multiplicacion;
       int division;
       
       
       System.out.println("Introduce un numero ");
       numero1 = s.nextInt();
       
       System.out.println("Introduce otro numero ");
       numero2 = s.nextInt();
       
       
       suma = numero1+numero2;
       System.out.println("El resultado de la suma es "+suma);
       
       resta = numero1 - numero2;
       System.out.println("El resultado de la resta es "+resta);
       
       multiplicacion = numero1*numero2;
       System.out.println("El resultado de la multiplicacion es "+multiplicacion);
       
       division = numero1/numero2;
       System.out.println("El resultado de la division es "+division);
    }
    
}
