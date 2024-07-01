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
public class Exercicio13 {
    public static void main(String[] args) {
        String prod1,prod2,prod3;
        int quant;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o nome do produto e sua quantidade");
        prod1=entrada.next();
        quant=entrada.nextInt();
        if (quant<30)
            System.out.println("produto abaixo do estoque minimo");
        System.out.println("Informe o nome do produto e sua quantidade");
        prod2=entrada.next();
        quant=entrada.nextInt();
        if (quant<30)
            System.out.println("produto abaixo do estoque minimo");
        System.out.println("Informe o nome do produto e sua quantidade");
        prod3=entrada.next();
        quant=entrada.nextInt();
        if (quant<30)
            System.out.println("produto abaixo do estoque minimo");
    }
}
