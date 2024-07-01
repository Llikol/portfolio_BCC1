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
public class Exercicio18 {
    public static void main(String[] args) {
        double saldo,credito;
        Scanner entrada=new Scanner(System.in);
        System.out.println("informe o saldo medio:");
        saldo=entrada.nextDouble();
        if (saldo>= 0 && saldo<=500)
            System.out.println("Nenhum credito");
        if (saldo>=500.01 && saldo<=1000){
            credito=saldo*30/100;
            System.out.println("O credito sera de: "+credito);}
        if (saldo>=1000.01 && saldo<=3000){
            credito=saldo*40/100;
            System.out.println("O credito sera de: "+credito);}
        if (saldo>3000){
            credito=saldo*50/100;
            System.out.println("O credito sera de: "+credito);}
    }
}
