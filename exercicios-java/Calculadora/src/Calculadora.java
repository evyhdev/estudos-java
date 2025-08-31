import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double num1, num2;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            System.out.println("Soma: " + String.format("%.2f", add(num1, num2)));
            System.out.println("Subtração: " + String.format("%.2f", subtract(num1, num2)));
            System.out.println("Multiplicação: " + String.format("%.2f", multiply(num1, num2)));
            System.out.println("Divisão: " + String.format("%.2f", divide(num1, num2)));
        } 
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }
}
