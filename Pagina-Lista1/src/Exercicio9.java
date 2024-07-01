package lista;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String args[]) {
	double numero;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Insira um numero para obter sua raiz");
        numero=entrada.nextInt();
        System.out.println("Sua raiz eh: ");
        System.out.println(Math.sqrt(numero));
    }
}
