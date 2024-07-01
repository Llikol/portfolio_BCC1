/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	int prova1;
        int prova2;
        int trabalho;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira as notas das provas e trabalhos: ");
        prova1=entrada.nextInt();
        prova2=entrada.nextInt();
        trabalho=entrada.nextInt();
        if ((prova1>=6 || prova2 >=6) && (trabalho>=7))
             System.out.println("aprovado");
        else
            System.out.println("reprovado");
    }
    
}
