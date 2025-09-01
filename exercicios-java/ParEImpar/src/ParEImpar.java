import java.util.Scanner;
public class ParEImpar{
    public static void main (String [] args){
        int quantNum;
        int num;
        int contPar = 0;
        int contImpar = 0;
        
        System.out.println("Digite a quantidade de numeros que deseja analisar: ");

        try (Scanner sc = new Scanner (System.in)) {
            quantNum = sc.nextInt();
            System.out.println("Digite os numeros: ");
            for (int i = 0; i < quantNum; i++){
            num = sc.nextInt();
            if (num % 2 == 0){
             contPar++;   
        }
        else {
            contImpar++;
        }
    }
}
        System.out.println("Quantidade de numeros pares: " + contPar);
        System.out.println("Quantidade de numeros impares: " + contImpar);
    }
}