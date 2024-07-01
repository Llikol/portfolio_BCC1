package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String args[]){
        double tempo;
        double distancia;
        boolean perigo;
        double velosom=340;
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##");
        System.out.println("Informe o tempo, em segundos, que transcorreu entre o avistamento e o som: ");
        tempo=entrada.nextDouble();
        String dx=df.format(tempo);
        distancia=velosom*tempo;
        System.out.println("A distancia foi de: "+distancia);
        perigo= distancia<200;
        System.out.println(perigo);
    }
}
