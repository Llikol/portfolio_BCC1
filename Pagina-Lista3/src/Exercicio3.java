package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]) {
        int peso;
        double altura;
        double imc;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o peso em kilos e a altura em metros: ");
        peso=entrada.nextInt();
        altura=entrada.nextDouble();
        String dx = df.format(altura);
        imc=peso/(altura*altura);
        System.out.println("O indice de massa corporal eh: "+imc);
        if (imc>25)
            System.out.println("Verificamos um peso acima do ideal");
        else
            System.out.println("O peso se encontra no ideal");
    }
}
