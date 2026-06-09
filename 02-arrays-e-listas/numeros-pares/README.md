# 🔢 Filtro e Contagem de Números Pares

Este projeto é uma aplicação de console em Java que lê uma quantidade de números inteiros definida pelo usuário e os armazena em um vetor (array). Em seguida, o programa identifica e exibe todos os números pares digitados, além de apresentar a quantidade total de números pares encontrados na estrutura. 

## 🧠 Aprendizados e Conceitos Aplicados

A construção deste algoritmo permitiu consolidar os seguintes conceitos de programação:

* **Operador de Módulo (`%`):** Utilização da expressão lógica `vect[i] % 2 == 0` para verificar se o resto da divisão por 2 é igual a zero, sendo a forma padrão de identificar se um número no array é par.
* **Variáveis de Contagem (Acumuladores):** Implementação da variável `quantityOfEvenNumbers` inicializada com o valor zero Este contador é incrementado em 1 (`+= 1`) a cada vez que a condição de número par é satisfeita dentro do laço de repetição.
* **Manipulação de Arrays e Laços (`for`):** Criação de um vetor de inteiros (`int[] vect = new int[numbersToBeRead]`) com tamanho dinâmico definido em tempo de execução. O código utiliza dois laços de repetição com responsabilidades únicas: o primeiro para popular a estrutura e o segundo para varrer o vetor realizando a filtragem.
* **Formatação Visual:** Uso estratégico de quebras de linha (`\n`) nos blocos de impressão (`System.out.println` e `System.out.print`) para exibir os números pares na mesma linha, separados por espaço, e isolar a mensagem de contagem total no final da execução.

## 🛠️ Estrutura do Código

A aplicação é executada a partir de um único arquivo:

* `application/Main.java`: Ponto de entrada do sistema. A classe instancia o `Scanner` (configurado com `Locale.US` para padronização), gerencia a entrada de dados do usuário, aloca o vetor na memória e executa as validações condicionais.

---
**Autor:** Caio Giacon