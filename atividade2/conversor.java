package conversaoDeTemperatura;

import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha a direção da conversão (1 para Celsius para Fahrenheit, 2 para Fahrenheit para Celsius): ");
        int escolha = scanner.nextInt();
        
        double resultado = 0.0;
        
        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            resultado = (celsius * 9/5) + 32;
            System.out.println("Resultado: " + resultado + " Fahrenheit");
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            resultado = (fahrenheit - 32) * 5/9;
            System.out.println("Resultado: " + resultado + " Celsius");
        } else {
            System.out.println("Escolha inválida!");
        }
        
        scanner.close();
    }
}
