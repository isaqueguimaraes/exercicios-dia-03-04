
# Divertidamente

"Com a mudança para uma nova cidade, as emoções de Riley, que tem apenas 11 anos de idade, ficam extremamente agitadas. <br>
Uma confusão na sala de controle do seu cérebro deixa a Alegria e a Tristeza de fora, afetando a vida de Riley radicalmente."

Faça um algoritmo que informe:

1. Se a Riley fez novas amizades na cidade, quantas amizades ela fez? <br>
  Para cada amizade feita pela Riley a emoção Alegria recebe 10 pontos por amizade.<br>
  Caso ela não tenha feito nenhuma amizade a emoção Tristeza recebe 30 pontos.

2. Na nova cidade, a Riley fez três provas na universidade: A1, A2 e A3. <br>
  Cada prova vale 10 pontos. Se a média da Riley for maior ou igual a sete, ela esta aprovada e a Alegria recebe 50 pontos.<br>
  Caso ela não alcance a média a emoção Tristeza recebe 50 pontos.

3. A Riley esta estudando programação.
  E ela tem 10 algoritmos para resolver. <br>
  Pergunte a Riley quantos exercícios ela conseguiu fazer.<br>
  Para cada exercício realizado soma-se 10 pontos para a Alegria e para cada não realizado 10 pontos para a Tristeza.

Agora, compare qual emoção possui mais pontos.
Caso a Alegria possua mais pontos que a Tristeza informe na tela:

~~~
A mudança para a nova cidade foi uma experiência incrível para a Riley.
~~~

Caso a Tristeza possua mais pontos informe:
~~~
A mudança para a nova cidade foi uma experiência desagradável para a Riley.
~~~


# Sonic 3

"Sonic, Knuckles e Tails se juntam para enfrentar Shadow, um novo e misterioso inimigo com poderes diferentes de tudo que já enfrentaram antes.
As habilidades do trio são superadas em todos os aspectos e eles precisam buscar uma improvável aliança."

Crie um programa em Java que simule essa análise, utilizando as seguintes informações baseadas na sinopse de Sonic 3:

### Novos Aliados:

        Pergunte ao usuário quantos novos aliados Sonic, Knuckles e Tails conseguiram encontrar para ajudar na luta contra Shadow.
        Se o número de novos aliados for maior que zero, para cada novo aliado, considere que a "Esperança" (uma emoção positiva da equipe) recebe 15 pontos.
        Caso não tenham encontrado novos aliados, o "Medo" (uma emoção negativa) recebe 40 pontos.

### Desafio de Poder:

        Considere que a equipe enfrentou três grandes confrontos iniciais contra Shadow (Desafio 1, Desafio 2 e Desafio 3).
        Cada confronto é avaliado em uma escala de 0 a 10, representando o quão bem a equipe se saiu (10 sendo sucesso total, 0 sendo derrota).
        Pergunte ao usuário a pontuação obtida pela equipe em cada um dos três desafios.
        Calcule a média das pontuações dos três desafios.
        Se a média for maior ou igual a 7, considere que a "Confiança" da equipe aumenta em 60 pontos.
        Caso a média seja inferior a 7, o "Desânimo" aumenta em 60 pontos.

### Busca por Soluções:

        A equipe precisa analisar 12 estratégias diferentes para tentar superar os poderes de Shadow.
        Pergunte ao usuário quantas dessas estratégias a equipe conseguiu analisar completamente.
        Para cada estratégia analisada, some 10 pontos à "Determinação" da equipe.
        Para cada estratégia não analisada, some 10 pontos à "Incerteza".

Ao final do programa, exiba a pontuação de cada uma das emoções/sentimentos analisados: 

Esperança/Medo, Confiança/Desânimo e Determinação/Incerteza. 

Some os pontos das Emocoes Positivas e tambem some os pontos das Emocoes Negativas.

Se a soma das Emocoes Positivas superarem as Emocoes Negativas, imprima no console que:

~~~
O Shadow foi derrotado.
~~~

Caso contrário:

~~~
O Shadow venceu o time do Sonic. 
~~~
