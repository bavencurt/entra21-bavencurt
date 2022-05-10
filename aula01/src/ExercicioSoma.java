import java.util.Scanner;

public class ExercicioSoma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = in.nextInt();
        int soma = 0;
        for (int i = 0; i <= numero; i++) {
            soma += i;
        }
        System.out.println("A soma dos valores até o número digitado é: "+soma);
    }
}
