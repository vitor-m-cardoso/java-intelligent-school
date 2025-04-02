# Java - Escola Inteligente

## Entregáveis

<details>
  <summary>O que foi desenvolvido</summary>

Uma aplicação Java que interage através do terminal apresentando algumas
funcionalidades para determinados departamentos:

- A funcionalidade de calcular a idade de um estudante em dias para o departamento `Pessoa Estudante`.
- A funcionalidade de calcular a média das notas de um estudante para o departamento `Secretaria`.
- A funcionalidade de gerar um relatório de controle de acesso dos estudantes na escola para o departamento `Portaria`.

</details>

## Orientações

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:

  ```bash
  mvn test
  ```

Para executar apenas uma classe de testes:

  ```bash
  mvn test -Dtest="ClassNameTest"
  ```

</details>

## Requisitos desenvolvidos

### Calcular a idade em dias para o departamento Pessoa Estudante

<details>
  <summary>Descrição</summary>

- Implementação dos métodos `coletarInformacoes` e `calcularIdadeEmDias` contidos na
classe `PessoaEstudante`.
- O método `coletarInformacoes` realiza a leitura do nome do estudante no console Java e mais três valores: anos, meses e dias.
- Já o método `calcularIdadeEmDias`, recebe 3 argumentos do tipo `int`: anos, meses e dias. Esse método calcula e retorna a idade do estudante em dias.

Suponha que a entrada seja:

  ```bash
  Boas vindas a Escola Inteligente!
  Escolha um departamento:
  1 - Pessoa Estudante - Calcular idade em dias
  2 - Secretaria - Calcular a média das notas
  3 - Portaria - Gerar relatório de controle de acesso
  1
  Qual o nome da Pessoa Estudante?
  Fulano
  Qual a sua idade em anos, meses e dias?
  anos:
  32
  meses:
  2
  dias:
  29
  ```

A saída final do programa é similar a essa:

  ```bash
  A idade de Fulano em dias é 11769.
  ```

</details>

## Calcular a média das notas de um estudante

<details>
  <summary>Descrição</summary>

- Implementação os métodos `coletarInformacoes` e `calcularMedia` contidos na classe `Secretaria`.
- O método `coletarInformacoes` realiza a leitura do nome da pessoa estudante do console Java e mais quatro valores que serão referentes às notas de 4 avaliações.
- Já o método `calcularMedia`, recebe 4 argumentos do tipo `float` ou `double`: nota1, nota2, nota3 e nota4. Esse método calcula e retorna a média.

Suponnha que a entrada seja:

  ```bash
  Boas vindas a Escola Inteligente!
  Escolha um departamento:
  1 - Pessoa Estudante - Calcular idade em dias
  2 - Secretaria - Calcular a média das notas
  3 - Portaria - Gerar relatório de controle de acesso
  2
  Qual o nome da Pessoa Estudante?
  Fulano
  Entre com as notas das provas:
  Avaliação 1:
  9.85
  Avaliação 2:
  9.58
  Avaliação 3:
  9.90
  Avaliação 4:
  8.75
  ```

A saída final do programa é similar a essa:

  ```bash
  A média das notas de Fulano é 9.52
  ```

</details>

## Realizar o controle de acesso e a emissão do relatório

<details>
  <summary>Descrição</summary>

- Implementação dos métodos `coletarInformacoes` e `emitirRelatorio` contidos na
classe `Portaria`.
- O método `coletarInformacoes` realiza a leitura da idade de todos os estudantes que acessam a escola pela portaria.
- Já o método `emitirRelatorio` informa o total de estudantes divididos nas categorias `Ensino Fundamental I`, `Ensino Fundamental II` e `Ensino Médio`.

A imagem abaixo mostra o fluxo que o programa segue:

![SistemaFluxograma](/images/controle-acesso.png)

- A coleta de informações do departamento `Portaria` tem o formato:

```bash
Entre com o número correspondente à opção desejada:
1 - Registrar o acesso de pessoa estudante
2 - Finalizar o acesso e emitir o relatório
```

Se a opção 1 for escolhida, então a mensagem `Entre com a idade da pessoa estudante:` será impressa no console. Em seguida, após inserir a idade do estudante e pressionar `enter`, aparecerá uma das mensagens listadas abaixo:

- `Pessoa estudante do Ensino Fundamental I, catraca liberada!`: se a idade da pessoa inserida for menor ou igual a 10 anos.

- `Pessoa estudante do Ensino Fundamental II, catraca liberada!`: se a idade da pessoa inserida for entre 11 e 14 anos.

- `Pessoa estudante do Ensino Médio, catraca liberada!`: se a idade da pessoa inserida for maior ou igual a 15 anos.

Depois que a mensagem for impressa, então retorna ao estado inicial do menu.

  ```bash
  Entre com o número correspondente à opção desejada:
  1 - Registrar o acesso de pessoa estudante
  2 - Finalizar o acesso e emitir o relatório
  1
  Informe a idade da pessoa estudante:
  12
  Pessoa estudante do Ensino Fundamental II, catraca liberada!
  Entre com o número correspondente à opção desejada:
  1 - Registrar o acesso de pessoa estudante
  2 - Finalizar o acesso e emitir o relatório
  ```

Esse ciclo se repete até a opção 2 ser escolhida, o que indica que os acessos foram finalizados e o relatório deve ser emitido.

---
