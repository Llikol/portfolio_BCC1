package lista;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {
	String nome;
        String endereço;
        int numero;
        int telefone;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome=entrada.nextLine();
        System.out.println("Digite seu endereco: ");
        endereço=entrada.nextLine();
        System.out.println("Digite o numero: ");
        numero=entrada.nextInt();
        System.out.println("Digite seu telefone: ");
        telefone=entrada.nextInt();
        System.out.println("Seu nome eh: "+nome);
        System.out.println("Seu endereco eh: " + endereço + ", " + numero);
        System.out.println("Seu telefone eh:"+ telefone);
    }
}
