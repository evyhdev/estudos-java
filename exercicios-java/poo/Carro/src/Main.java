    class Carro {

        private String modelo;
        private int velocidade;

        //construtor
        public Carro (String modelo, int velocidade) {
            this.modelo = modelo;
            this.velocidade = velocidade;
        }

        //get
        public String getModelo (){
            return modelo;
        }
        public int getVelocidade(){
            return velocidade;
        }

        //set
        public void setModelo(String modelo){
            this.modelo = modelo;
        }
        public void setVelocidade(int velocidade){
            this.velocidade = velocidade;
        }

        //criando metodos
        void mostrarInfo(){
            System.out.println("Modelo: " + getModelo());
            System.out.println("Velocidade: " + getVelocidade());
        }

        void acelerar(int incremento){
            velocidade+= incremento;
        }

        void frear( int decremento){
            velocidade -= decremento;
            if (velocidade < 0){
                velocidade = 0;
            }
        }
    }
    public class Main{
        public static void main (String[] args){
            Carro c1 = new Carro("Corsa", 80);
            c1.mostrarInfo();
            c1.acelerar(10);
            c1.frear(30);

    }
}
































