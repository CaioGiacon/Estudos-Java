# 🔝 Maior Número e Posição (Vetores)

Este projeto é uma aplicação de console em Java que lê uma quantidade predefinida de números reais, armazenando-os em um vetor (array). Após a leitura, o programa percorre a estrutura de dados para localizar o maior número inserido e a sua respectiva posição (índice) no vetor.

## 🧠 Aprendizados e Conceitos Aplicados

A resolução deste problema exigiu a combinação de iterações com lógica condicional, aprofundando os seguintes fundamentos algorítmicos:

* **Algoritmo de Busca (Máximo):** Implementação da lógica de substituição condicional (`if(realNumbersVect[i] > greatestNumber)`), onde uma variável de referência é atualizada iterativamente sempre que um valor maior é encontrado no array.
* **Rastreamento de Índice (Indexação):** Além de capturar o valor em si, o código armazena a posição exata onde a condição foi satisfeita, utilizando a variável auxiliar `greatestNumberPosition` sincronizada com o contador `i` do laço `for`.
* **Separação de Responsabilidades nos Laços:** O código utiliza duas estruturas `for` independentes. A primeira é inteiramente dedicada à alimentação dinâmica do vetor pelo teclado (`sc.nextDouble()`), enquanto a segunda foca exclusivamente na regra de negócio (busca linear pelo maior valor).
* **Manipulação de Arrays em Ponto Flutuante:** Criação e navegação em estruturas indexadas contendo tipos primitivos `double`.

## 🛠️ Estrutura do Código

A aplicação é executada de forma procedimental a partir de um único arquivo:

* `applicattion/Main.java`: Ponto de entrada do sistema. Gerencia a leitura de dados com `Scanner` (`Locale.US`), aloca o vetor na memória com base na entrada do usuário e executa o processamento para encontrar e exibir a maior variável rastreada.

---
**Autor:** Caio Giacon