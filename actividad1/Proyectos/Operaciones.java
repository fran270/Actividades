/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero;
import java.util.Scanner;
/**
 *
 * @author alumnado
 */
public class Operaciones{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int numero;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        
        System.out.println("Introduce un numero: ");
        numero = s.nextInt();
        
        System.out.println("Introduce otro numero: ");
        numero = s.nextInt();
        
        suma = numero + numero;
        System.out.println("El resultado de la suma es "+suma);
        
        resta = numero - numero;
        System.out.println("El resultado de la resta es "+resta);
        
        multiplicacion = numero * numero;
        System.out.println("El resultado de la multiplicacion es "+multiplicacion);
        
        division = numero / numero;
        System.out.println("El resultado de la division es "+division);
    }
    
}

