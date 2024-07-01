/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio5 {
    public static void main(String args[]){
        int numero;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite um numero e receba sua condição: ");
        numero=entrada.nextInt();
        if (numero<=10)
            System.out.println("F1");
        if ((10<numero) && (numero<=100))
                System.out.println("F2");
        if (numero>100)
             System.out.println("F3");   
    }
}
