/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
/**
 *
 * @author alunolages
 */
public class Exercicio12 {
    public static void main(String args[]){
        int segundos;
        int minutos;
        int horas;
        int dia=24;
        int totalsec;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o horario, primeiro a hora, minuto e entao segundo: ");
        horas=entrada.nextInt();
        minutos=entrada.nextInt();
        segundos=entrada.nextInt(); 
        horas=segundos*3600;
        minutos=segundos*60;
        totalsec = 24*3600-(horas+minutos+segundos);
        System.out.println("o total passado em segundo foi: "+totalsec);
    }
}
        