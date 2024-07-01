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
public class Exercicio8 {

    public static void main(String[] args) {
        String nome;
        char categoria;
        double salario, aumento, reajuste;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do funcionario: ");
        nome = entrada.next();
        System.out.println("informe a categoria: ");
        categoria = entrada.next().charAt(0);
        System.out.println("Informe o salario atual: ");
        salario = entrada.nextDouble();
        if (categoria == 'A' || categoria == 'H') {
            aumento = salario * 10/100;
            reajuste = salario + aumento;
            System.out.println("passara a receber " + reajuste + ", com o aumento de " + aumento + "de seu salario");
        } else if (categoria == 'B' || categoria == 'D' || categoria == 'E') {
            aumento = salario * 15 / 100;
            reajuste = salario + aumento;
            System.out.println("passara a receber " + reajuste + ", com o aumento de " + aumento + "de seu salario");
        } else if (categoria == 'C' || categoria == 'F') {
            aumento = salario * 25 / 100;
            reajuste = salario + aumento;
            System.out.println("passara a receber " + reajuste + ", com o aumento de " + aumento + "de seu salario");
        } else{
            aumento = salario * 30 / 100;
            reajuste = salario + aumento;
            System.out.println("passara a receber " + reajuste + ", com o aumento de " + aumento + "de seu salario");
        }
    }
}
