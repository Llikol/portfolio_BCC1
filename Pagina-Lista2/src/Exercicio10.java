/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author alunolages
 */
public class Exercicio10 {
    public static void main(String args[]){
        double valorkilo;
        valorkilo=39.0;
        double valorprato;
        double valorpagar;
        double pesoprato;
        pesoprato=0.45;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o peso do prato em kilos: ");
        valorprato=entrada.nextDouble();
        valorpagar=valorkilo*valorprato;
        valorprato= pesoprato+valorprato;
        String dx = df.format(valorprato);
        System.out.print(dx);
        System.out.println("O valor a ser pago sera: : "+valorpagar);
    }
}
