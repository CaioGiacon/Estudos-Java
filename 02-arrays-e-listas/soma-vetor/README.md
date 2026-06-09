# ➕ Soma e Média de Vetores

Este projeto de console em Java recebe uma quantidade definida de números reais, armazena-os em um vetor e realiza as operações matemáticas para calcular a soma total e a média aritmética dos valores digitados. 

## 🧠 Aprendizados e Conceitos Aplicados

A construção deste algoritmo permitiu explorar a integração de operações matemáticas com iterações em estruturas de dados:

* **Arrays de Ponto Flutuante:** Criação e manipulação de vetores do tipo primitivo `double` (`new double[numbersToBeRead]`) para lidar com números reais.
* **Variáveis Acumuladoras:** Implementação da variável `sum` iniciada em `0.0`, responsável por receber cumulativamente o valor de cada elemento do vetor (`sum += vect[i]`) durante a iteração do laço `for`.
* **Cálculo de Média:** Utilização da propriedade `vect.length` para extrair o tamanho exato da estrutura de dados alocada e realizar a divisão de forma dinâmica (`sum / vect.length`).
* **Formatação de Saída:** Uso do `System.out.printf("%.1f ", vect[i])` para iterar e exibir os elementos do vetor formatados uniformemente com uma casa decimal, mantendo-os na mesma linha.

## 🧮 A Lógica Matemática

O cálculo da média aritmética embutido no código distribui a soma dos elementos pelo número total de posições do array. O processamento matemático pode ser representado por:

$$Average = \frac{Sum}{vect.length}$$

## 🛠️ Estrutura do Código

A aplicação é executada de forma procedimental a partir de um único arquivo:

* `application/Main.java`: Ponto de entrada do sistema. A classe instancia o `Scanner` com `Locale.US` para leitura de pontos flutuantes, divide as responsabilidades em laços de repetição independentes (leitura, soma e impressão final) e encerra a execução de forma limpa utilizando `sc.close()`.

---
**Autor:** Caio Giacon