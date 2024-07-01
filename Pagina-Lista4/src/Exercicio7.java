/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio7 {
    public static void main(String args[]){
        int n1;
        int n2;
        int n3;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite 3 numeros e obtenha sua ordem crescente: ");
        n1=entrada.nextInt();
        n2=entrada.nextInt();
        n3=entrada.nextInt();
        if (n1>n2){
            int aux = n2;
            n2=n1;
            n1=aux;}
        if (n2>=n3){
            int aux=n3;
            n3=n2;
            n2=aux;}
        if (n1>n2){
            int aux=n1;
            n2=n1;
            n1=aux;}
            System.out.println("A ordem crescente eh: "+n1+n2+n3);
    }
    
}
