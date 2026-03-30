# Jogo da Velha em Java

Jogo da Velha desenvolvido em Java para dois jogadores, focado em lógica de programação e tratamento de dados.

## 📝 Descrição do Projeto

O objetivo deste projeto é realizar a implementação do **Jogo da Velha** em linguagem Java. O jogo foi projetado para ser executado via linha de comando, seguindo as seguintes diretrizes:

### 🎮 Funcionamento
* **Tabuleiro:** Jogado sobre uma grade de 3x3 casas.
* **Dinâmica:** * Um dos jogadores escolhe uma casa e a marca com um **círculo (O)**.
    * O outro escolhe outra casa e a marca com um **xis (X)**.
    * Os jogadores se alternam até que uma linha seja formada (vertical, horizontal ou diagonal).
* **Condições de Término:**
    * **Vitória:** O primeiro jogador a completar uma linha vence.
    * **Empate:** Ocorre quando não há mais jogadas possíveis (conhecido como "velha").

### 💻 Especificações Técnicas
* **Interface:** O jogador deve inserir suas coordenadas diretamente no terminal.
* **Fluxo:** O programa imprime o tabuleiro atualizado e aguarda a jogada do próximo participante.
* **Validações:** * Não é permitido marcar casas já ocupadas.
    * Não é permitido jogar em coordenadas inexistentes (fora do tabuleiro).
* **Arquitetura:** A classe que encapsula a lógica contém métodos específicos para validar jogadas antes de processá-las, utilizando tratamento de erros ou exceções.
