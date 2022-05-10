import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número para calcular o seu fatorial");
        int var1 = in.nextInt();
        int fatorial = 1;
        if (var1 == 0) {
            fatorial = 0;
            System.out.println("Fatorial de 0 é 0");
        }else{
        for (int i =var1; i >0; i--) {
            fatorial *= i;
        }
        System.out.println("O fatorial de "+ var1 + " é: " + fatorial);
    }
}}
