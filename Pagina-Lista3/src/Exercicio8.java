package lista3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String args[]){
        int compra;
        int pago;
        int troco;
        int notas100;
        int notas10;
        int notas1;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Qual o valor da compra: ");
        compra=entrada.nextInt();
        System.out.println("qual o valor pago: ");
        pago=entrada.nextInt();
        troco=pago-compra;
        System.out.println("o troco sera de: "+ troco);
        notas100=troco/100;
        troco %=100;
        notas10=troco/10;
        troco%=10;
        notas1=troco/1;
        System.out.println("notas 100: "+notas100);
        System.out.println("notas 10: "+notas10);
        System.out.println("notas 1: "+notas1);
    }
}
