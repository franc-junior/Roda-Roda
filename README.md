# Projeto-POO-N1
- Baseado em orientação a objetos.

- Inspirado no programa de tv Roda Roda Jequti, o programa tem o objetivo de ser um jogo que faz o jogador usar o raciocinio para descobrir qual a palavra escondida, baseando-se apenas na quantidade de letras e no tema escolhido inicialmente.

- É jogado com dois competidores onde ganha quem consegue acumular mais dinheiro no fim da partida.

### Como Funciona
- Inicialmente os jogadores escolhem um tema, com isso uma palavra é selecionada aleatoriamente na lista que contem as palavras com o tema escolhido, assim imprimindo uma string de traços ("-") do tamanho da palavra seleconada, eliminando os espaços vazios.
- Após, o jogador da rodada escolherá entre girar a roleta ou tentar palavra.
  - Se a escolha for girar a roleta, um valor entre, 100 e 1000, ou perdeu a vez, ou perdeu tudo, será apresentado como resposta da roleta, caindo um valor numérico, o jogador deverá digitar uma letra que será veriaficada na palavra escondida, estando presente, a letra ira aparecer nos seus respectivos lugares, e o valor da roleta será multiplicada pela quantidade de letras encontradas na palavra. Os casos, perdeu tudo e passou a vez são auto explicativos.
  - Se a escolha for Tentar palavra, o jogador da rodada digitará a palavra, se a palavra digitada estiver igual a palavra escondia o jogador da rodada recebe R$10000 e o jogo finaliza.
- O jogo finaliza quando a palavra é completada.
