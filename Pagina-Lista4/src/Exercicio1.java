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
public class Exercicio1 {
    public static void main(String args[]) {
        double preco;
        int quilowatts;
        double conta;
        double juros;
        double atraso;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner entrada=new Scanner(System.in);
        System.out.println("insira o preço do quilowatt e a quantidade gasta: ");
        preco=entrada.nextDouble();
        String dx = df.format(preco);
        quilowatts=entrada.nextInt();
        conta=quilowatts*preco;
        juros= conta*10/100;
        System.out.println("O valor da conta eh: "+conta);
        atraso=conta+juros;
        System.out.println("O valor da conta, com a taxa de atraso, seria: "+atraso);
        if (quilowatts>70) 
            System.out.println("Verificamos um consumo elevado de energia");
        else
            System.out.println("Verificamos um cosumo normal de energia");
    }
}
