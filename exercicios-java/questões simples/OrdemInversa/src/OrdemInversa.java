import java.util.Scanner;
public class OrdemInversa {
    public static void main (String args[]){
        try (Scanner sc = new Scanner (System.in)){
        int [] numeros = new int[6]; //vetor de seis inteiros
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
                for (int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }  
        }
 
    }
}
