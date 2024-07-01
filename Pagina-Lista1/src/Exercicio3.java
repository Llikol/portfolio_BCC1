package lista;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]) {
        int numero;
        int sucessor;
        int antecessor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero=entrada.nextInt();
        sucessor=numero+1;
        antecessor=numero-1;
        System.out.println("O numero eh: "+numero);
        System.out.println("Seu antecessor eh:"+antecessor);
        System.out.println("Seu sucessor eh:"+sucessor);
   }
    
}

