package lista3;

import java.util.Scanner;

public class Exercicio16 {
     public static void main(String[] args){
        double dian,mesn,anon,diaa,mesa,anoa,diav,mesv,anov,total;
        Scanner entrada=new Scanner(System.in);
        System.out.println("informe o dia de nascimento: ");
        dian=entrada.nextInt();
         System.out.println("informe o mes de nascimento");
        mesn=entrada.nextInt();
         System.out.println("informe o ano de nascimento");
        anon=entrada.nextInt();
        System.out.println("informe o dia atual: ");
        diaa=entrada.nextInt();
        System.out.println("informe o mes atual");
        mesa=entrada.nextInt();
         System.out.println("informe o ano atual");
        anoa=entrada.nextInt();
        anov=anoa-anon;
        anov=anov*360;
        mesv=mesa-mesn;
        mesv=mesv*30;
        diav=diaa-dian;
        total=anov+mesv+diav;
         System.out.println("o total vivido eh de: "+total);
    }
}
