import java.util.Scanner;

public class PinBanco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Digite seu PIN\nVocê tem três tentativas\nPrimeira tentativa");
        for (int i = 0; i < 3; i++ ) {
            int pin = in.nextInt();
            if (pin == 91352) {
                System.out.println("PIN correto acesso liberado!");
            } else {
            System.out.printf("PIN incorreto!!");
            }
        }}}

// correção
