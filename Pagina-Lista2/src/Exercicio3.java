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
public class Exercicio3 {
    public static void main(String args[]){
        double base;
        double altura;
        double area;
        double perimetro;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Para calcular a area e o perimentro do retangulo, Informe a medida de sua base e altura: ");
        base=entrada.nextDouble();
        altura=entrada.nextDouble();
        area= base*altura;
        perimetro= base+base+altura+altura;
        System.out.println("sua area eh: "+area);
        System.out.println("seu perimetro eh: "+perimetro);
    }
}
