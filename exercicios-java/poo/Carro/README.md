🚗 Exercício: Carro
Descrição

Este programa em Java cria uma classe Carro com os atributos modelo e velocidade.
A classe possui métodos para:

mostrarInfo() → exibe o modelo e a velocidade atual do carro.

acelerar(int incremento) → aumenta a velocidade em um valor passado como parâmetro.

frear(int decremento) → diminui a velocidade em um valor passado, garantindo que a velocidade não fique negativa.

No programa principal (Main), são criados objetos do tipo Carro e chamados seus métodos para demonstrar o funcionamento.

✅ Casos de Teste
Ação no programa	Saída esperada
Criar carro: "Corsa", 80	
mostrarInfo()	"Modelo: Corsa"
"Velocidade: 80"
acelerar(10) + mostrarInfo()	"Modelo: Corsa"
"Velocidade: 90"
frear(30) + mostrarInfo()	"Modelo: Corsa"
"Velocidade: 60"
frear(100) + mostrarInfo()	"Modelo: Corsa"
"Velocidade: 0"