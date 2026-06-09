# ➗ Média de Números Pares (Vetores)

Este projeto é uma aplicação de console em Java que processa um vetor de números inteiros para identificar exclusivamente os valores pares, calcular a soma entre eles e exibir a média aritmética.

## 🧠 Aprendizados e Conceitos Aplicados

A construção deste algoritmo consolidou as seguintes práticas de lógica de programação:

* **Filtragem Condicional em Arrays:** Uso do operador de módulo (`vect[i] % 2 == 0`) dentro de um laço `for` para isolar apenas os dados de interesse (números pares) antes de processá-los.
* **Múltiplos Acumuladores:** Gerenciamento simultâneo de duas variáveis de estado: uma para somar os valores encontrados (`evenSum`) e outra para contar a ocorrência de números pares (`quantityOfEvenNumbers`).
* **Prevenção de Exceções (Divisão por Zero):** Implementação de uma verificação de segurança (`if(quantityOfEvenNumbers == 0)`) para evitar a falha matemática e de execução caso o vetor não contenha nenhum número par.
* **Casting (Conversão de Tipos):** Aplicação do operador `(double)` para forçar que o resultado da divisão entre dois números inteiros seja processado e exibido como um número de ponto flutuante.

## 🧮 A Lógica Matemática

A lógica deste algoritmo foca em isolar um subconjunto de dados (os pares) para então aplicar o cálculo da média. A média aritmética condicional é processada pela seguinte fórmula:

$$MediaPares = \frac{\sum NumerosPares}{QuantidadeDePares}$$

## 🛠️ Estrutura do Código

A aplicação foi desenvolvida de forma procedimental em um único arquivo:

* `application/Main.java`: Ponto de entrada do programa. Configura o `Scanner` com `Locale.US`, realiza a alocação dinâmica do vetor de inteiros, executa os laços de iteração para coleta e soma, e aplica as regras de negócio para exibição condicional do resultado final.

---
**Autor:** Caio Giacon