/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alunolages
 */

public class Exercicio4 {
   public static void main(String args[]) {
	double numero1;
	double numero2;
        DecimalFormat df = new DecimalFormat("0.##");
       	Scanner entrada=new Scanner(System.in);
        System.out.println("Informe uma temperatura em celcius: ");
       	numero1=entrada.nextDouble();
       	numero2= (9*numero1)/5+32;
        String dx = df.format(numero2);
        System.out.print(dx);
        System.out.println("Seu valor em Fahreheit eh: " + numero2);
    }
}
