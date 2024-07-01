package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        double salliquido,salbruto, inss, imposto;
        int dependentes;
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##");
        System.out.println("informe o salario bruto: ");
        salbruto=entrada.nextDouble();
        System.out.println("informe o numero de dependentes");
        dependentes=entrada.nextInt();
        inss=salbruto*11/100;
        imposto=salbruto*15/100;
        salliquido= salbruto-(inss+imposto)+150;
        System.out.println("o salario bruto eh de: "+salbruto);
        System.out.println("o salario liquido eh de: "+salliquido);
        System.out.println("o numero de dependentes eh de: "+dependentes);
    }
}
