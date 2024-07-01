package lista;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String args[]) {
	int numero;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira o numero para obter seu quadrado: ");
        numero=entrada.nextInt();
        numero= numero*numero;
        System.out.println("Seu quadrado eh: "+numero);
    }
}
