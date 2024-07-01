/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio2 {
    public static void main(String args[]){
        int numero1;
        int numero2;
        int soma;
        int quadrado;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe 2 numeros e obtenha o quadrado da soma: ");
        numero1=entrada.nextInt();
        numero2=entrada.nextInt();
        soma= numero1+numero2;
        quadrado=soma*soma;
        System.out.println("O quadrado da soma eh: "+quadrado);
        
    }
}
