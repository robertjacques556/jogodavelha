import java.util.Scanner;

/*Realize a implementação do Jogo da Velha em Java. O Jogo da Velha é um jogo para dois
    jogadores e que deve ser jogado sobre um tabuleiro de 3x3 casas. Um dos jogadores escolhe
    uma casa e a marca com um círculo. Em seguida o outro escolhe outra casa e a marca com um xis.
     Os jogadores continuam se alternando desta forma, até que uma linha com os mesmos símbolos seja
     formada, na vertical, horizontal ou diagonal. No caso, o jogador que completou a linha, vence o jogo.
      O jogo também acaba se não houver mais jogadas possíveis, o que caracteriza um empate.
     Durante a execução do programa, cada jogador deve escrever sua jogada (coordenadas) na linha de comando,
      e o jogo deve imprimir o tabuleiro e esperar pela jogada do próximo jogador. O programa não deve permitir
      que o jogador tente marcar uma casa que já esteja marcada, nem que tente jogar em casas que não existam.
      A classe que encapsula a lógica do jogo deve conter métodos para testar se uma dada jogada é válida, que
      devem ser chamados antes de efetuar a jogada de fato. Ou pode-se fazer este tratamento de erro com exceções.
     */
    public class jogoDaVelha {

        static char [][] tabela = {
                {' ',' ',' '},
                {' ', ' ',' '},
                {' ',' ',' '}
        };

        public static void mostrarTabela(){

            System.out.println("----Tabuleiro---");
            for(int i = 0; i<tabela.length;i++){


                System.out.println(tabela[i][0]+"|"+tabela[i][1]+"|"+tabela[i][2]);

                if(i<2){
                    System.out.println("-----");
                }

            }

        }


        public static void main(String[] args) {
            boolean jogoAtivo = true;

            while(jogoAtivo) {
                mostrarTabela();

                Scanner ler = new Scanner(System.in);
                System.out.println("Quem é o jogador que quer joga (O ou X): ");
                char jogador = ler.next().charAt(0);

                if (jogador != 'O' && jogador != 'X') {
                    System.out.println("O jogador digitado é diferente de (O ou X)");
                    continue;
                }
                System.out.println("Digite a posição da linha que quer jogar: ");
                int linha = ler.nextInt();
                System.out.println("Digite a posição da linha que quer jogar: ");
                int coluna = ler.nextInt();

                if(linha >=0 && linha<3 || coluna>=0 && coluna<3){

                    if(tabela[linha][coluna] ==' '){

                        tabela[linha][coluna] = jogador;
                        mostrarTabela();

                    }else{
                        System.out.println(" Não tem mais espaço disponivel");
                    }



                }

            }


    }
}
