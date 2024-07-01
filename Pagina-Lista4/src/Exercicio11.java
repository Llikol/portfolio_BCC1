/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import java.util.Scanner;
import java.time.LocalTime;

/**
 *
 * @author alunolages
 */
public class Exercicio11 {
    public static void main(String[] args) {
        var horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);
        horaAtual = horaAtual.plusSeconds(1);
        System.out.println("Hora alterada: " + horaAtual);
    }
}
