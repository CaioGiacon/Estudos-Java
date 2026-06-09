# 📐 Calculadora de Área de Triângulos

Este mini projeto é uma aplicação de console em Java desenvolvida para calcular e comparar a área de dois triângulos. O exercício faz parte da minha trilha de estudos no Curso de Java Completo (Nélio Alves - Udemy), marcando o avanço prático no paradigma de Orientação a Objetos e complementando meu background anterior em Python.

## 🧠 Aprendizados e Conceitos Aplicados

O foco principal deste exercício prático foi a transição estrutural do código, consolidando os seguintes conceitos fundamentais do Java:

* **Instanciação de Objetos:** Criação prática de objetos (`x` e `y`) a partir da classe base `Triangle`, compreendendo como a memória é alocada e como cada objeto mantém seus próprios estados de forma independente no Heap.
* **Criação de Métodos e Delegação:** Transferência da responsabilidade da lógica matemática da classe principal para a própria entidade. O cálculo foi encapsulado no método `area()` dentro da classe `Triangle`. Isso tornou a classe `Main` muito mais limpa, coesa e focada apenas na interação com o usuário.

## 🧮 A Matemática (Fórmula de Heron)

A lógica encapsulada na entidade utiliza a Fórmula de Heron para encontrar a área de um triângulo conhecendo apenas as medidas de seus três lados ($a$, $b$ e $c$).

Primeiro, o programa calcula o semiperímetro ($p$):

$$p = \frac{a + b + c}{2}$$

Em seguida, a área é processada aplicando a raiz quadrada (utilizando `Math.sqrt`):

$$Area = \sqrt{p(p-a)(p-b)(p-c)}$$

## 🛠️ Estrutura do Código

O projeto foi dividido em pacotes para manter a organização e separar as responsabilidades:

* `aplicattion/Main.java`: Ponto de entrada do programa. Responsável por ler os dados via teclado (usando `Scanner` com `Locale.US` para leitura correta de pontos flutuantes), instanciar as entidades e exibir qual triângulo possui a maior área.
* `entities/Triangle.java`: Classe de domínio que representa a entidade Triângulo, contendo os atributos públicos (`a`, `b`, `c`) e o método responsável por processar e retornar o valor de sua própria área.

---
**Autor:** Caio Giacon
