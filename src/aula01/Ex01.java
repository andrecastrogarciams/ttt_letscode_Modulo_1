package aula01;

import java.util.Scanner;

public class Ex01 {
    /*
    Escreva um programa que com base em uma temperatura em graus celsius, realize a conversão e exiba os resultados conforme as fórmulas abaixo:
    Kelvin
    K = Celsius + 273.15;
    Fahrenheit
    F = Celsius * 1.8 + 32;
    Rankine
    Ra = Celsius * 1.8 + 32 + 459.67
    Réaumur
    Re = Celsius * 0.8;
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe temperatura em Célsios: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaKelvin = temperaturaCelsius + 273.15;
        System.out.printf("%nTemperatura em Kelvin: %.2f", temperaturaKelvin);

        double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.printf("%nTemperatura em Farenheit: %.2f", temperaturaFarenheit);

        double temperaturaReaumur = temperaturaCelsius * 0.8;
        System.out.printf("%nTemperaturam em Réaumur: %.2f", temperaturaReaumur);
        scanner.close();
    }
}
