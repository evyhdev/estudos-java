class Bola {
    // Atributos privados
    private String cor;
    private int tamanho;
    private boolean inflada;

    // Construtor
    Bola(String cor, int tamanho, boolean inflada) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.inflada = inflada;
    }

    // Getters
    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isInflada() { // boolean usa "is" no padrão Java
        return inflada;
    }

    // Setters
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        if (tamanho > 0) { // regra de validação
            this.tamanho = tamanho;
        } else {
            System.out.println("Tamanho inválido!");
        }
    }

    public void setInflada(boolean inflada) {
        this.inflada = inflada;
    }

    // Outros métodos
    void mostrarInfo() {
        System.out.println(cor + ", " + tamanho + ", " + inflada);
    }

    void chutar() {
        if (inflada) {
            System.out.println("Chute forte!");
        } else {
            System.out.println("A bola está murcha!");
        }
    }

    void inflar() {
        if (inflada) {
            System.out.println("A bola já está inflada!");
        } else {
            inflada = true;
            System.out.println("A bola foi inflada!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bola bola1 = new Bola("vermelha", 5, true);

        // Usando getters
        System.out.println("Cor da bola: " + bola1.getCor());

        // Alterando cor via setter
        bola1.setCor("azul");

        // Testando alteração
        System.out.println("Nova cor: " + bola1.getCor());
    }
}
