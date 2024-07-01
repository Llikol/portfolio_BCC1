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
public class Exercicio15 {
    public static void main(String[] args) {
        int idade;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe a idade");
        idade=entrada.nextInt();
        if (idade>=5 && idade<=10)
            System.out.println("esta na categoria infantil");
        if (idade>=11 && idade<=17)
            System.out.println("esta na categoria juvenil");
        if (idade>=18 && idade<=60)
            System.out.println("esta na categoria adulto");
        if (idade>60)
            System.out.println("esta na categoria senior");
    }
}
