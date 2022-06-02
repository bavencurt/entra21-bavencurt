import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int pontuacaoJ1 = 0;
        int pontuacaoJ2 = 0;
        while (pontuacaoJ1 < 10 && pontuacaoJ2 < 10){
            //usuario
            int escolhaUsuario = -1;
            while (!escolhaValida(escolhaUsuario)) {
                System.out.println("Escolha (0) Pedra, (1) Papel ou (3)");
                escolhaUsuario = in.nextInt();
                if (!escolhaValida(escolhaUsuario)) {

                }
            }
            String escolhaUsuarioString = escolhaString(escolhaUsuario);
        for (int i = 0; i < 10; i++)  {
            int escolha = r.nextInt(3);
            String escolhaComputadorString = escolhaString(escolha);
            System.out.println("(Jogador)");

        }
    }
}

    public static String escolhaString(int escolha) {
        switch (escolha) {
            case 0:
                return ("Pedra");
            case 1:
                return ("Papel");
            case 2:
                return ("Tesoura");
            default:
                return "Escolha Errada";
        }


    }

    public static boolean escolhaValida(int escolha) {

        return escolha > -1 && < 3;
    }
}


