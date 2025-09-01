import java.util.Scanner;
public class SomaDosPares {
    public static void main (String[] args){
        int num;
        try (Scanner scanner = new Scanner (System.in)){
            System.out.print("Digite um número: ");
            num = scanner.nextInt();
        }
        int soma = somaDosPares(num);
        System.out.println("A soma dos números pares é " + soma);

    }
    public static int somaDosPares (int num){
        int soma = 0;
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                soma += i;
            }
        }
            return soma;

    }
    }
