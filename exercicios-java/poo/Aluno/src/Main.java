class Aluno {
    private String nome;
    double nota1;
    double nota2;

    //criando construtor 
    Aluno (String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void mostrarInfo(){
        System.out.println("Nome: " + nome + "\nPrimeira Nota: " + nota1 + "| Segunda Nota: " + nota2);
    }
    double verificarMedia (){
        return (nota1 + nota2) / 2;
    }

    void verificarAprovacao (){
        double media = verificarMedia(); 
        System.out.println("Sua média é: " + media); 
        if (media >= 7){
            System.out.println("Sua situação é: Aprovado");
        }
        else {
            System.out.println ("Sua situação é: Reprovado");
        }
    }
}

public class Main {
    public static void main (String [] args){
        Aluno aluno1 = new Aluno ("Gabi", 10, 8);
        Aluno aluno2 = new Aluno ("Luana", 7, 3);
       aluno1.mostrarInfo();
       aluno2.mostrarInfo(); 

    }
}