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
public class Exercicio4 {
    public static void main(String args[]){
    int numero;
    Scanner entrada=new Scanner(System.in);
    System.out.println("Digite um numero para obter se ele eh par ou impar: ");
    numero=entrada.nextInt();
    if (numero%2==0)
            System.out.println("O numero eh par");
    else
            System.out.println("O numeor eh impar");
    }
}
