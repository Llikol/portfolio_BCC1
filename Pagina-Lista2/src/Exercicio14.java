/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;


/**
 *
 * @author alunolages
 */
public class Exercicio14 {
    public static void main(String args[]){
        double salario=1500;
        double conta1=200;
        double conta2=120;
        double multa1;
        double multa2;
        double salariofinal;
        System.out.println("O salario de Joao eh de: "+salario);
        multa1=conta1*2/100;
        multa2=conta2*2/100;
        System.out.println("O valor dos juros sao resoectivamente:"+multa1+ " e "+multa2);
        salariofinal=salario-(conta1+multa1+conta2+multa2);
        System.out.println("Restara de seu salario: "+salariofinal);
    }
}
