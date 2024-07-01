package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        double total, nparcela, npago, pago, valor, devedor;
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##");
        System.out.println("informe o valor total do consorcio:");
        total=entrada.nextDouble();
        System.out.println("infome o numero total de parcelas:");
        nparcela=entrada.nextInt();
        System.out.println("informe o numero de parcelas pagas:");
        npago=entrada.nextInt();
        valor=total/nparcela;
        pago=npago*valor;
        devedor=total-pago;
        System.out.println("o total pago pelo cliente foi de: "+pago);
        System.out.println("o saldo devedor eh de: "+devedor);
        
    }
}
