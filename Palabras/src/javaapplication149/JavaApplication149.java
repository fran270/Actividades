/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication149;
import java.util.Scanner;
/**
 *
 * @author Fran Crespo Crespo
 */
public class JavaApplication149 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int x;
       int a;
       int b = 0;
       
       System.out.println("Dame el valor de a");
       a = s.nextInt();
       
       System.out.println("Dame el valor de b");
       b = s.nextInt();
       
       if(a!=0){
           x = -b/a;
           
           System.out.println("Solucion de la ecuacion :"+x);
           
       }else if(b!=0){
           System.out.println("Solucion imposible");
       }else{
           System.out.println("Solucion indeterminada");
       }
    }
    
}
