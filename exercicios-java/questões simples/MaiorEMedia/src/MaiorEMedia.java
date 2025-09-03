import java.util.Scanner;
public class MaiorEMedia {
    //ler 5 numeros, mostrar o maior e a media
    public static void main(String[] args) throws Exception {
        int num = 0;
        int maior = num;
        int somatorio = 0;
        double media;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite 5 numeros: ");
            for (int i = 0; i < 5; i++){
                num = sc.nextInt();
                if (num > maior){
                    maior = num;

            }
            somatorio += num;

        }
    } 
        media = somatorio / 5.0;
        System.out.println("O maior numero é: " + maior);
          System.out.println("A media é: " + media);
    }
}

