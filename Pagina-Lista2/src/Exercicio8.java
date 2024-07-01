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
public class Exercicio8 {
    public static void main(String args[]){
        int dividendo;
        int divisor;
        divisor=2;
        int quociente;
        int resto;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe um numero para obter seu quociente e resto: ");
        dividendo=entrada.nextInt();
        quociente=dividendo/divisor;
        resto= dividendo%divisor; 
        System.out.println("seu quociente eh: "+quociente);
        System.out.println("seu resto eh: "+resto);
        
    }
}
