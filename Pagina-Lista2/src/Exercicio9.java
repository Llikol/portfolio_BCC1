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
public class Exercicio9 {
    public static void main(String args[]){
        int segundos;
        int minutos;
        int horas;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Quantos segundos tem o video: ");
        segundos=entrada.nextInt();
        minutos=(segundos%3600)/60;
        horas=segundos/3600;
        if (horas >= 0)
        System.out.printf(" %d horas", horas);
        if (minutos >= 0)
        System.out.printf(" %d minutos", minutos);
        segundos%=60;
        if (segundos > 0)
        System.out.printf(" %d segundos", segundos);
    }
}
