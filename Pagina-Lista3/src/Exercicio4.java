package lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {
	int prova1;
        int prova2;
        int trabalho;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe as notas das provas e trabalhos: ");
        prova1=entrada.nextInt();
        prova2=entrada.nextInt();
        trabalho=entrada.nextInt();
        if ((prova1>=6 || prova2 >=6) && (trabalho>=7))
             System.out.println("aprovado");
        else
            System.out.println("reprovado");
        
    }
}
