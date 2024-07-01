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
public class Exercicio12 {
    public static void main(String[] args) {
        int angulo;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o angulo: ");
        angulo=entrada.nextInt();
        if (angulo<90)
            System.out.println("angulo agudo");
        if (angulo==90)
            System.out.println("angulo reto");
        if (angulo>90)
            System.out.println("angulo obtuso");
    }
}
