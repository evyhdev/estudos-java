import java.util.Scanner;
public class Velocidade {
    public static void main(String[] args) throws Exception {
        int velocidade = 0;
        try ( Scanner sc = new Scanner (System.in)) {
            velocidade = sc.nextInt();
            System.out.println(multa(velocidade));
        }
        
    }
    public static String multa (int velocidade){
        if (velocidade > 60){
            return "Foi Multado";
        } else{
            return "Nao foi Multado";
        }
    }
}
