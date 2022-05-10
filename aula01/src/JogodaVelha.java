import java.util.Scanner;

public class JogodaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '_';
          }}
        Scanner in = new Scanner(System.in);
        System.out.println("Jogo da Velha!");
        System.out.print("Nome do jogador 1: ");
        String jogador1 = in.nextLine();
        System.out.print("Nome do jogador 2: ");
        String jogador2 = in.nextLine();

        boolean player1 = true;

        boolean fimJogo = false;
        while(!fimJogo) {

            matrizTabuleiro(tabuleiro);
            if(player1) {
                System.out.println(jogador1 + " é o (x):");
            } else {
                System.out.println(jogador2 + " é o (o):");
            }
            char c = '_';
            if(player1) {
                c = 'x';
            } else {
                c = 'o';
            }
            int linha = 0;
            int coluna = 0;
            while(true) {
                System.out.print("Número da linha (0, 1, ou 2): ");
                linha = in.nextInt();
                System.out.print("Número da coluna (0, 1, ou 2): ");
                coluna = in.nextInt();
                if (linha < 0 || coluna < 0 || linha > 2 || coluna > 2) {
                    System.out.println("Fora do tabuleiro.");
                } else if (tabuleiro[linha][coluna] != '_') {
                    System.out.println("Alguém já escolheu esse lugar, tente novamente.");
                } else {
                    break;
                }
            }
            tabuleiro[linha][coluna] = c;
            if(jogadorGanhou(tabuleiro) == 'x') {
                System.out.println(jogador1 + " Venceu!");
                fimJogo = true;
            } else if(jogadorGanhou(tabuleiro) == 'o') {
                System.out.println(jogador2 + " Venceu!");
                fimJogo = true;
            } else {
                if(tabuleiroCheio(tabuleiro)) {
                    System.out.println("Deu Velha!");
                    fimJogo = true;
                } else {
                    player1 = !player1;
                }
            }
        }matrizTabuleiro(tabuleiro);
            }
    public static void matrizTabuleiro(char[][] tabuleiro) {
        System.out.println("Tabuleiro:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }
    }
    public static char jogadorGanhou(char[][] tabuleiro) {
        for(int i = 0; i < 3; i++) {
            if(tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != '_') {
                return tabuleiro[i][0];
            }
        }
        for(int j = 0; j < 3; j++) {
            if(tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j] && tabuleiro[0][j] != '_') {
                return tabuleiro[0][j];
            }
        }
        if(tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != '_') {
            return tabuleiro[0][0];
        }
        if(tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[0][2] && tabuleiro[2][0] != '_') {
            return tabuleiro[2][0];
        }
        return ' ';
    }
    public static boolean tabuleiroCheio(char[][] tabuleiro) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(tabuleiro[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}