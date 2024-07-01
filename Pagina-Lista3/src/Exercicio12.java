package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        int mat,port, gerais;
        double media;
        String can1;
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##");
        System.out.println("digite o nome do(a) candidato(a): ");
        can1=entrada.next();
        System.out.println("digite suas notas");
        mat=entrada.nextInt();
        String dx=df.format(mat);
        port=entrada.nextInt();
        String dy=df.format(port);
        gerais=entrada.nextInt();
        String dr=df.format(gerais);
        media=(mat+port+gerais)/3;
        if (media>=7 && port>=5 && mat>=5 && gerais>=5)
            System.out.println("o(a) candidato(a) " + can1+ " foi aprovado(a) com media: "+media);
        else
            System.out.println("o(a) candidato(a) "+ can1+ " foi eliminado(a)");
    }
}
