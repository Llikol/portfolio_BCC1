package lista;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String args[]) {
	double numero1;
	double numero2;
       	Scanner entrada=new Scanner(System.in);
        System.out.println("Insira uma temperatura em celcius: ");
       	numero1=entrada.nextInt();
       	numero2= (9*numero1+160) / 5;
        System.out.println("Seu valor em Fahreheit eh: " + numero2);
    }
}
