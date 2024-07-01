package lista3;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        int numero, prim, seg, terc, soma;
        Scanner entrada=new Scanner(System.in);
        System.out.println("digite um numero de 0 a 999: ");
        numero=entrada.nextInt();
        prim=numero/100;
        seg=(numero%100)/10;
        terc=numero%10;
        soma=prim+seg+terc;
        System.out.println("a soma sera: "+soma);
    }
}
