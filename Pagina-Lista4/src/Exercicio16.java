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
public class Exercicio16 {
    public static void main(String[] args) {
        int x, y;
        Scanner entrada=new Scanner(System.in);
        System.out.println("informe o valor de x da coordenada: ");
        x=entrada.nextInt();
        System.out.println("Informe o valor de y da coordenada: ");
        y=entrada.nextInt();
        if (x>0 && y>0)
            System.out.println("Primeiro quadrante");
        if (x<0 && y>0)
            System.out.println("Segundo quadrante");
        if (x<0 && y<0)
            System.out.println("Terceiro quadrante");
        if (x>0 && y<0)
            System.out.println("Quarto quadrante");
    }
}
