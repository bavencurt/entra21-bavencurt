import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas palavras você deseja informar:");
        int qtde = in.nextInt();
        String[] palavras = new String[qtde];
        for(int i = 0; i < qtde; i++ ) {
            System.out.print("Digite uma palavra:");
            palavras[i] = in.next();
        }
        for (int i =0; i < palavras.length; i++) {
            if (i == 0) {
                System.out.print(palavras[i]);
            } else {
                System.out.print(" ,"+palavras[i]);
            }
        }
    }
}
