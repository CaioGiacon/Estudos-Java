# 🔢 Filtro de Números Negativos (Vetores)

Este projeto é uma aplicação de console em Java que lê uma quantidade de números inteiros definida pelo usuário, armazena-os em um vetor (array) e, em seguida, itera sobre essa estrutura para exibir apenas os valores negativos.

## 🧠 Aprendizados e Conceitos Aplicados

A construção deste algoritmo permitiu fixar conceitos fundamentais sobre estruturas de dados indexadas e fluxo de controle:

* **Vetores (Arrays):** Compreensão da alocação de memória para estruturas de tamanho fixo no Heap, utilizando a sintaxe `new int[numbersToBeRead]` para criar o array com base na entrada do usuário.
* **Laços de Repetição (`for`):** Utilização da estrutura `for` dividida em duas responsabilidades claras:
    1. Iterar e popular o vetor recebendo os inputs do teclado.
    2. Percorrer o tamanho total da estrutura utilizando a propriedade `vect.length` para leitura dos dados.
* **Lógica Condicional Indexada:** Aplicação de condicional `if (vect[i] < 0)` dentro do laço de repetição para filtrar e extrair propriedades específicas dos dados armazenados.

## 🛠️ Estrutura do Código

A aplicação é executada em um único arquivo:

* `applicattion/Main.java`: Ponto de entrada que concentra a lógica. A classe faz uso do `Scanner` para captação de dados, configurado com `Locale.US.

---
**Autor:** Caio Giacon