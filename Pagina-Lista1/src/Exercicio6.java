package lista;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String args[]) {
	double consumo;
        double distancia;
        double volume;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira a distancia percorrida: ");
        distancia=entrada.nextInt();
        System.out.println("Insira o volume de combustivel consumido: ");
        volume=entrada.nextInt();
        consumo= distancia/volume;
        System.out.println("O consumo mehdio eh de: " + consumo);
    }
}
