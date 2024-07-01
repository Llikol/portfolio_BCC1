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
public class Exercicio9 {
    public static void main(String[] args){
        int numero, operacao;
        double saldo, valor, novosaldo;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira o numero da conta: ");
        numero=entrada.nextInt();
        System.out.println("Informe o saldo atual");
        saldo=entrada.nextDouble();
        System.out.println("escolha a operacao a ser realizada: 1-saque 2-deposito");
        operacao=entrada.nextInt();
        System.out.println("escolha o valor da operacao:");
        valor=entrada.nextDouble();
        if (operacao==1){
            novosaldo=saldo+valor;
            System.out.println("O novo saldo sera: "+novosaldo);}
         if (operacao==2){
            novosaldo=saldo-valor;
            System.out.println("O novo saldo sera: "+novosaldo);
            if (novosaldo<0){
                System.out.println("conta estourada");}}
    }
}
