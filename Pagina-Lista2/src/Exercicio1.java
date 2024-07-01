/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int numero1;
        int numero2;
        int soma;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe 2 numeros e obtenha a soma de seus quadrados: ");
        numero1=entrada.nextInt();
        numero1= numero1*numero1;
        numero2=entrada.nextInt();
        numero2= numero2*numero2;
        soma= numero1+numero2;
        System.out.println("a soma de seus quadrados eh: "+soma);
    }
    
}
