AP2 e APS - Desenvolvimento de Sistemas para Web 2024.1
A APS vale até 3 pontos e é referente apenas ao código e a AP2 vale até 7 pontos e é referente à
explicação do código.

O intuito deste trabalho é criar um programa capaz de cadastrar e listar objetos do tipo Jogo. Você
deverá utilizar as seguintes tecnologias: JSF e Primefaces.

a) [1,0] Criar a classe Jogo que deve possuir pelo menos as seguintes variáveis: id (Integer),
nomeJogador (String), numeroAposta (Integer), numeroSecreto (Integer), resultado (String) e data
(Date) com seus respectivos gets e sets.

b) [1,0] Criar uma página de cadastro (index.xhtml) cuja principal funcionalidade é salvar objetos do
tipo Jogo. A página deve conter os seguintes campos: “Nome do jogador” e “Número aposta”.
Utilizar um panelGrid para organizar os campos. Além disso, essa página deve possuir um link ou um
botão para redirecionar para a página de listagem.

c) [3,0] Cada objeto do tipo Jogo deve ser armazenado em um ArrayList na classe JogoBean.
• A variável id deve ser preenchida automaticamente e sequencialmente.
• A variável data deve ser preenchida automaticamente com a data atual (new Date()).
• A variável numeroSecreto deve ser preenchida automaticamente com um número
randômico (usar a classe Random) de 1 a 5.
• A variável resultado deve ser preenchida automaticamente com “acertou” caso o
número da aposta e o número secreto sejam iguais, ou “não acertou” caso sejam
diferentes.

d) [1,5] Criar uma página de listagem (listagem.xhtml) para exibir os elementos salvos na página
“index.xhtml” através de um dataTable. Além disso, essa página deve possuir um link ou botão para
redirecionar para a página index.xhtml criada no item “e”.

e) [1,0] Implementar uma funcionalidade que permita selecionar e excluir um elemento da tabela
criada no item anterior.

h) [1,5] Implementar uma funcionalidade que permita exibir a quantidade de elementos da tabela
criada no item “d” através de um <p:messages>.

j) [1,0] Implementar a classe JogoBean, que deve permitir a comunicação entre as páginas criadas
nos itens “b” e “d” viabilizando a execução dos outros itens. 
