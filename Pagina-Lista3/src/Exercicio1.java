package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String args[]) {
        double preco;
        int quilowatts;
        double conta;
        double juros;
        double atraso;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o preço do quilowatt e a quantidade gasta: ");
        preco = entrada.nextDouble();
        String dx = df.format(preco);
        quilowatts = entrada.nextInt();
        conta = quilowatts * preco;
        juros = conta * 10 / 100;
        System.out.println("O valor da conta eh: " + conta);
        atraso = conta + juros;
        System.out.println("O valor da conta, com a taxa de atraso, seria: " + atraso);
    }

}
