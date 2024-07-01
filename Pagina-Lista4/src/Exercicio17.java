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
public class Exercicio17 {
    public static void main(String[] args) {
        double peso;
        int cod=7;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o peso");
        peso=entrada.nextDouble();
        System.out.println("informe o código do planeta:");
        cod=entrada.nextInt();
        switch (cod){
            case 1: 
                System.out.println("o peso em Mercurio seria: "+peso*0.37);
                break;
            case 2:
                System.out.println("o peso em Venus seria:  "+peso*0.88);
                break;
            case 3:
                System.out.println("o peso em Marte seria:  "+peso*0.38);
                break;
            case 4:
                System.out.println("o peso em Jupiter seria:  "+peso*2.64);
                break;
            case 5:
                System.out.println("o peso em Saturno seria:  "+peso*1.15);
                break;
            case 6:
                System.out.println("o peso em Urano seria:  "+peso*1.17);
                break;
            case 7:
                System.out.println("o peso em Netuno seria:  "+peso*1.18);
                break;
        }
    }
}
