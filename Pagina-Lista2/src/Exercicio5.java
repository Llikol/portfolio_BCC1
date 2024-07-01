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
public class Exercicio5 {
    public static void main(String args[]){
        double tipo1;
        tipo1=1.50;
        double tipo2;
        tipo2=2;
        double tipo3;
        tipo3=0.75;
        int quantidade1;
        int quantidade2;
        int quantidade3;
        double lucroportipo1;
        double lucroportipo2;
        double lucroportipo3;
        double lucrototal;
        Scanner entrada=new Scanner(System.in);
        System.out.println("quantos sorvetes do tipo 1 foram vendidos e seu lucro: ");
        quantidade1=entrada.nextInt();
        lucroportipo1= tipo1*quantidade1;
        System.out.println("seu lucro foi: "+lucroportipo1);
        System.out.println("quantos sorvetes do tipo 2 foram vendidos e seu lucro: ");
        quantidade2=entrada.nextInt();
        lucroportipo2= tipo2*quantidade2;
        System.out.println("seu lucro foi: "+lucroportipo2);
        System.out.println("quantos sorvetes do tipo 3 foram vendidos e seu lucro: ");
        quantidade3=entrada.nextInt();
        lucroportipo3= tipo3*quantidade3;
        System.out.println("seu lucro foi: "+lucroportipo3);
        lucrototal= lucroportipo1+lucroportipo2+lucroportipo3;
        System.out.println("o lucro total foi: "+lucrototal);
    }
}
