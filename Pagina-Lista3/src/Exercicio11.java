package lista3;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        int num1, num2, num3,soma;
        Scanner entrada=new Scanner(System.in);
        System.out.println("digite 3 numeros para receber sua soma: ");
        num1=entrada.nextInt();
        num2=entrada.nextInt();
        num3=entrada.nextInt();
        soma=num1+num2;
        if (soma>num3)
            System.out.println("a soma dos dois primeiros numeros é maior que o terceiro: ");
        else
            System.out.println("a soma dos dois primeiros numeros é maior que o terceiro: ");
    }
}
