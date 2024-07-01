package lista3;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        double merc1,merc2,merc3,merc12,merc22,merc32,inf1,inf2,inf3,inf, au1,au2,au3,total;
        Scanner entrada=new Scanner(System.in);
        System.out.println("informe os precos das mercadorias no dia 01/01/2022: ");
        merc1=entrada.nextInt();
        merc2=entrada.nextInt();
        merc3=entrada.nextInt();
        System.out.println("informe os precos das mercadorias no dia 01/02/2022: ");
        merc12=entrada.nextInt();
        merc22=entrada.nextInt();
        merc32=entrada.nextInt();
        inf1=merc12-merc1;
        inf2=merc22-merc2;
        inf3=merc32-merc3;
        au1=merc1*(inf1/100);
        au2=merc2*(inf2/100);
        au3=merc3*(inf3/100);
        total=au1+au2+au3;
        System.out.println("a inflaçao foi de: "+total);
        if (total>=0.55/100)
            System.out.println("esta acima da meta: ");
        else
            System.out.println("nao esta acima da meta");
    }
}
