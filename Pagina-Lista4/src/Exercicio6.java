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
public class Exercicio6 {
     public static void main(String args[]){
        int numero1;
        int numero2;
        int numero3;
        int local;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite 3 numeros e obtenha o menor entre eles: ");
        numero1=entrada.nextInt();
        numero2=entrada.nextInt();
        numero3=entrada.nextInt();
        if (numero1<numero2)
            local=numero1;
        else
            local=numero2;
        if (local<numero3)
             System.out.println("O menor numero eh: "+ local);   
        else
             System.out.println("O menor numero eh: "+ numero3);
    }
}
