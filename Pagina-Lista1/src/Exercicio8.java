package lista;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String args[]) {
	int numero1;
        int numero2;
        int numero3;
        int numero4;
        int soma;
        Scanner entrada=new Scanner(System.in);
        System.out.println("insira 4 numeros e obtenha a soma de seus quadrados: ");
        numero1=entrada.nextInt();
        numero1= numero1*numero1;
        numero2=entrada.nextInt();
        numero2= numero2*numero2;
        numero3=entrada.nextInt();
        numero3= numero3*numero3;
        numero4=entrada.nextInt();
        numero4= numero4*numero4;
        soma= numero1+numero2+numero3+numero4;
        System.out.println("Agora a soma de seus quadrados: " + soma);
    }
}
