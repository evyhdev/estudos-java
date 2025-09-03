class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private int velocidade;

    public Carro() {
        this.modelo = "Desconhecido";
        this.cor = "Indefinida";
        this.ano = 0;
        this.velocidade = 0;
    }

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = 0;
        this.velocidade = 0;
    }

    public void acelerar(int valor) {
        this.velocidade += valor;
    }

    public void frear(int valor) {
        this.velocidade -= valor;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public String getModelo() { return this.modelo; }
    public String getCor() { return this.cor; }
    public int getAno() { return this.ano; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setCor(String cor) { this.cor = cor; }
    public void setAno(int ano) { this.ano = ano; }

    public void mostrarDados() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Velocidade: " + this.getVelocidade() + " km/h");
        System.out.println("-------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Gol", "Prata", 2018);
        Carro c2 = new Carro();
        Carro c3 = new Carro("Celta", "Branco");

        c1.mostrarDados();

        c1.acelerar(50);
        c1.mostrarDados();

        c1.frear(20);
        c1.mostrarDados();

        c1.frear(100); // não deve ficar negativo
        c1.mostrarDados();

        c2.mostrarDados();
        c3.mostrarDados();
    }
}






































