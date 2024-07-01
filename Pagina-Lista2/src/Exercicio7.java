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
public class Exercicio7 {
    public static void main(String args[]){
        double cafe;
        cafe=2.2;
        double leite;
        leite=1.8;
        double bolacha;
        bolacha=4.3;
        int quantidade1;
        int quantidade2;
        int quantidade3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gastototal;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Quantidade de cafe comprada: ");
        quantidade1=entrada.nextInt();
        gasto1= cafe*quantidade1;
        System.out.println("seu gasto com cafe foi: "+gasto1);
        System.out.println("Quantidade de leite comprada: ");
        quantidade2=entrada.nextInt();
        gasto2= leite*quantidade2;
        System.out.println("seu gasto com leite foi: "+gasto2);
        System.out.println("Quantidade de bolacha comprada: ");
        quantidade3=entrada.nextInt();
        gasto3=bolacha*quantidade3;
        System.out.println("seu gasto com bolacha foi: "+gasto3);
        gastototal= gasto1+gasto2+gasto3;
        System.out.println("o lucro total foi: "+gastototal);
    }
}
