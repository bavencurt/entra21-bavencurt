import java.util.Scanner;

public class codesdope {
    public static void main(String[] args) {

        exe09();
    }

    public static void exe01() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a largura:");
        double larg = in.nextDouble();
        System.out.println("Digite o comprimento:");
        double comp = in.nextDouble();
        if (larg == comp) {
            System.out.println("É um quadrado!");
        } else {
            System.out.println("É um retângulo!");
        }
    }
    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor1 = in.nextInt();
        System.out.println("Digite um valor:");
        int valor2 = in.nextInt();
        if (valor1>valor2) {
            System.out.println(valor1);
        }else {
            System.out.println(valor2);
        }
    }
    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de produtos");
        int prod = in.nextInt();

        if (prod > 10) {
        double custo = (prod * 100) - (prod*100*0.1);
            System.out.printf("Valor final: R$%.2f", custo);
        } else {
            int custo1 = prod * 100;
            System.out.printf("Valor final: R$%d", custo1);

        }
    }
    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        double salario = in.nextDouble();
        System.out.println("Tempo de empresa:");
        int tempo = in.nextInt();
        if (tempo > 5 ) {
            double bonus = salario *0.05;
            System.out.printf("Seu bônus será: R$%.2f", bonus);
        } else {
            System.out.println("Sem bônus");
        }
    }
    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira uma nota:");
        int nota = 0;
    }
    public static void exe06() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase");
        int qtde = 0;
        String frase = in.nextLine();
        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' ') {
                    qtde++;
        }
    }
                    System.out.println("A quantidade de espaços é: "+qtde);
    }
    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de linhas:");
        int linhas = in.nextInt();
        System.out.println("Digite o número de colunas:");
        int colunas = in.nextInt();
            for (int i = 0; i < linhas; i++) {
                for(int j = 0; j < colunas; j++){
                    System.out.print("#");
            }System.out.println("");
        }

    }
        public static void exe08() {
            int[][] m = new int[4][4];

            for (int i = 0; i < m.length ; i++) {
                for (int j = 0; j < m[i].length ; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static void exe09() {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            soma += in.nextInt();
        }
            System.out.println("A soma é: "+soma);
        }
    }

