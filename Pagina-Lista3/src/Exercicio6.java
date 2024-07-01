package lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String args[]){
        int altura;
        int largura;
        int comprimento;
        int areapiso;
        int volumesala;
        int areaparedes;
        int potar;
        int aparelho;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o valor da altura, comprimento e largura da sala: ");
        altura=entrada.nextInt();
        comprimento=entrada.nextInt();
        largura=entrada.nextInt();
        areapiso=largura*comprimento;
        areaparedes=2*(altura*comprimento)+2*(altura*largura);
        volumesala=altura*comprimento*largura;
        System.out.println("Area do piso: "+areapiso);
        System.out.println("Volume da sala: "+volumesala);
        System.out.println("Area das paredes: "+areaparedes);
        if (volumesala<100)
            System.out.println("deve ser instalado um ar pequeno");
        if (volumesala>100 && volumesala<500)
            System.out.println("deve ser instalado um ar medio");
        if (volumesala>500)
            System.out.println("deve ser instalado um ar grande");
    }
}
