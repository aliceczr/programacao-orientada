package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        
        double resultado = 0.0;
        
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    System.exit(1); // Encerra o programa com erro
                }
                break;
            default:
                System.out.println("Operação inválida!");
                System.exit(1); // Encerra o programa com erro
        }
        
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}
