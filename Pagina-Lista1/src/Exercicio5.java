package lista;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
	double y;
        double x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero que determinara a funcao: ");
        x=entrada.nextInt();
        y= 3 * x + 2;
        System.out.println("O resultado eh: " + y);
    }
}
