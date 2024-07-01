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
public class Exercicio6 {
    public static void main(String args[]){
        double salariofinal;
        double valorvendas;
        double comissao1;
        double comissao2;
        int quantivendas;
        int salariofixo;
        int salariominimo;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o salario fixo: ");
        salariofixo=entrada.nextInt();
        salariominimo=2*salariofixo;
        System.out.println("Informe a quantidade de carros vendidos: ");
        quantivendas=entrada.nextInt();
        comissao1= 150*quantivendas;
        System.out.println("Informe o valor de vendas: ");
        valorvendas=entrada.nextDouble();
        comissao2=0.05*valorvendas;
        salariofinal= salariominimo+comissao1+comissao2;
        System.out.println("o salario do funcionario sera: "+salariofinal);
    }
}
