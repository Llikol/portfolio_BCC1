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
public class Exercicio13 {
     public static void main(String args[]) {
        double peso;
        double pesoamais;
        double pesoamenos;
        double calculo;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o peso atual: ");
        peso=entrada.nextDouble();
        pesoamais=peso*15/100;
        calculo=peso+pesoamais;
         System.out.println("Novo peso ao engordar: "+calculo);
        pesoamenos= peso*20/100;
        calculo= peso-pesoamenos;
        System.out.println("Novo peso ao emagrecer: "+calculo);
    }
}
