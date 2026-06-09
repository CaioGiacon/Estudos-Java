# ➕ Soma de Vetores (Elemento por Elemento)

Este projeto é uma aplicação de console em Java projetada para instanciar dois vetores numéricos inteiros do mesmo tamanho, coletar seus valores via entrada do usuário e gerar um terceiro vetor resultante. 

## 🧠 Aprendizados e Conceitos Aplicados

O desenvolvimento deste algoritmo exigiu um gerenciamento de memória e fluxo de repetição, abordando os seguintes conceitos:

* **Gerenciamento de Múltiplos Arrays:** Instanciação de três estruturas de dados de tamanho fixo idêntico (`vectorA`, `vectorB` e `vectorC`), onde a dimensão é determinada de forma dinâmica pela variável `quantityOfElements` fornecida pelo usuário.
* **Correlação de Índices:** Utilização avançada do contador `i` no laço de repetição (`for`) para acessar simultaneamente a mesma posição em vetores distintos. Isso permite ler os valores corretos das fontes de dados para compor o vetor resultante.
* **Otimização de Laços (Loops):** Separação estratégica de responsabilidades. O código utiliza dois laços independentes para a fase de leitura (input) de cada vetor separadamente, garantindo uma boa experiência para o usuário. Em seguida, um terceiro laço unifica o processamento da soma e a impressão dos resultados (output), economizando ciclos de CPU.

## 🧮 A Lógica Matemática

A lógica central deste algoritmo baseia-se em uma soma vetorial elemento a elemento. Para cada posição (índice $i$) variando de 0 até o tamanho total da estrutura, o valor do terceiro vetor é calculado pela soma dos elementos na mesma posição dos dois primeiros vetores:

$$C_i = A_i + B_i$$

No código Java, essa operação matemática é representada pela instrução:
`vectorC[i] = vectorA[i] + vectorB[i];`

## 🛠️ Estrutura do Código

A aplicação foi desenvolvida de forma estruturada e procedimental, contida em um único arquivo:

* `application/Main.java`: Ponto de entrada do programa. Responsável por inicializar o `Scanner` para captação de dados, alocar a memória no Heap para os três vetores de inteiros, orquestrar os laços de repetição e processar a soma vetorial antes de encerrar o programa com `sc.close()`.

---
**Autor:** Caio Giacon