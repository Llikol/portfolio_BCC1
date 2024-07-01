/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio14 {
    public static void main(String[] args) {
        double altura, peso;
        char genero;
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##");
        System.out.println("Informe o genero da pessoa: M ou F");
        genero=entrada.next().charAt(0);
        System.out.println("Informe a altura: ");
        altura=entrada.nextDouble();
        String dx=df.format(altura);
        if (genero=='M'){
            peso=72.7*altura-58;
            System.out.println("o peso ideal eh: "+peso);}
        if (genero=='F'){
            peso=62.1*altura-44.7;
            System.out.println("o peso ideal eh: "+peso);}
        if (genero!='F' && genero!='M')
            System.out.println("Erro, informe o genero corretamente");
        }
    }
