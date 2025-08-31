import java.util.Scanner;
public class MaiorIdade {
    public static void main(String[] args) throws Exception {
        int maiorIdade = 18;
        int pessoaIdade;
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite sua idade: ");
            pessoaIdade = scanner.nextInt();
        }
        verificarMaiorIdade(pessoaIdade, maiorIdade);
    }
    public static void verificarMaiorIdade(int idade, int maiorIdade) {
        if (idade >= maiorIdade){
            System.out.println("É maior de idade");
            }
            else {
                System.out.println("É menor de idade");
            
            }
            }
            }