import java.util.Scanner;

public class ExeAbrev {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Digite seu Nome Completo ");
        String nome = in.nextLine();
            String[] completo = nome.split(" ");
            String primeiroNome = completo[0];
            char primeiraLetra = primeiroNome.charAt(0);
            if (completo.length > 1) {
                String ultimoNome = completo[completo.length - 1];
                char ultimaLetra = ultimoNome.charAt(0);
                System.out.printf("Suas Iniciais: %c.%c.",primeiraLetra,ultimaLetra);
            }
            else {
                System.out.println("Primeira letra do nome: " + primeiraLetra);
            }
        }
    }

