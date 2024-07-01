package lista3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
	int prova1;
        int prova2;
        int trabalho;
        int frequencia;
        boolean aprovado;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe as notas das provas e trabalho, e a frequencia: ");
        prova1=entrada.nextInt();
        prova2=entrada.nextInt();
        trabalho=entrada.nextInt();
        frequencia=entrada.nextInt();
        aprovado= ((prova1>=6 || prova2 >=6) && trabalho>=7 && frequencia>=75) || (trabalho==6 && frequencia>=90);
        System.out.println(aprovado);
        
    }
}
