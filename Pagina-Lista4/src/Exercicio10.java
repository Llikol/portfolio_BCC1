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
public class Exercicio10 {
    public static void main(String[] args){
        int x,y,z;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe os numeros para analise: ");
        x=entrada.nextInt();
        y=entrada.nextInt();
        z=entrada.nextInt();
        if (x<y+z && y<x+z && z<x+y){
            if (x==y && y==z)
                System.out.println("Equilatero");}
        if (x<y+z && y<x+z && z<x+y){
            if ((x==y && y!=z) || (x==z && z!=y) || (y==z && z!=x))
                System.out.println("Isosceles");}
        if (x<y+z && y<x+z && z<x+y){
            if (x!=y && y!=z && x!=z)
                System.out.println("Escaleno");}
        else
            System.out.println("Nao eh triangulo");
            
    }
}
