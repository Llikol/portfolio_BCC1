package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        double distancia, consumo, preco;
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##");
        System.out.println("Distancia percorrida");
        distancia=entrada.nextDouble();
        String dx=df.format(distancia);
        System.out.println("Consumo medio de gasolina");
        consumo=entrada.nextDouble();
        String dy=df.format(consumo);
        consumo=distancia/consumo;
        System.out.println("Valor do litro da gasolina");
        preco=entrada.nextDouble();
        String dr=df.format(preco);
        preco=preco*consumo;
        System.out.println("o valor pago sera em: "+preco);
    }
}
