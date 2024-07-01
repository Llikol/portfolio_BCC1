package lista3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        int num1, num2;
        Scanner entrada=new Scanner(System.in);
        System.out.println("digite 2 numeros para receber sua igualdade: ");
        num1=entrada.nextInt();
        num2=entrada.nextInt();
        if (num1==num2)
            System.out.println("Os numeros sao iguais");
        else
            System.out.println("Os numeros nao sao iguais");
    }
}
