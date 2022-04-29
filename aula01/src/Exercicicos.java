import java.util.Scanner;

public class Exercicicos {
    public static void main(String[] args) {
        exe17();
    }

    public static void exe01() {
        int varA = 10;
        int varB = 20;
        int varC = varA;
        varA = varB;
        varA = varC;
        System.out.println(varA);
        System.out.println(varB);
    }

    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = in.nextInt();
        System.out.println(--valor);
    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor a base do retângulo: ");
        double base = in.nextDouble();
        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = in.nextDouble();
        double area = base * altura;
        double perimetro = (base + altura) * 2;
        System.out.printf("O valor da área é: %2f\nO valor do perímetro é: %2f", area, perimetro);
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade em anos, meses e dias:");
        System.out.print("Anos:");
        int anos = in.nextInt();
        System.out.print("Meses:");
        int meses = in.nextInt();
        System.out.print("Dias:");
        int dias = in.nextInt();
        int dias1 = anos * 365;
        int dias2 = meses * 30;
        int idade = dias + dias1 + dias2;
        System.out.printf("Sua idade em dias é: %d dias!!", idade);
    }

    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de eleitores do município:");
        int eleitores = in.nextInt();
        System.out.print("Total de votos brancos:");
        int brancos = in.nextInt();
        System.out.print("Total de votos nulos:");
        int nulos = in.nextInt();
        int validos = eleitores - brancos - nulos;
        double perc1 = validos * 100.0 / eleitores;
        double perc2 = brancos * 100.0 / eleitores;
        double perc3 = nulos * 100.0 / eleitores;
        System.out.printf("Estatísticas:\nVotos válidos: %d\nPercentual dos votos\nVotos válidos: %.2f%%\nVotos brancos: %.2f%%\nVotos nulos: %.2f%% ", validos, perc1, perc2, perc3);

    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor de seu salário atual: ");
        double salario = in.nextDouble();
        System.out.print("Digite o percentual de reajuste salarial: ");
        double reajuste = in.nextDouble();
        double calculo = reajuste / 100 * salario;
        double novo = calculo + salario;
        System.out.printf("Seu novo salário será: R$%.2f", novo);
    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor do carro:");
        double preco = in.nextDouble();
        double imp1 = 0.28 * preco;
        double imp2 = 0.45 * preco;
        double carro = preco - imp1 - imp2;
        System.out.printf("Você pagou R$%.2f pelo carro, pagou R$%.2f ao distribuidor e pagou R$%.2f de impostos", carro, imp1, imp2);


    }

    public static void exe08() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do salário:");
        double salario = in.nextDouble();
        System.out.println("Digite o valor da comissão fixa:");
        double fixa = in.nextDouble();
        System.out.println("Digite quantos carros foram vendidos:");
        double qtde = in.nextDouble();
        System.out.println("Digite o valor das vendas mensal:");
        double total = in.nextDouble();
        double paycheck = salario + (fixa * qtde) + (0.05 * total);
        System.out.printf("Seu salário será: R$%.2f", paycheck);
    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Bem vindo ao conversor de temperaturas\nDigite a temperatura em Fahrenheit:\n");
        double temp1 = in.nextDouble();
        double temp2 = (temp1 - 32) / 1.8;
        System.out.printf("Essa é a temperatura em graus celsius: %.1f", temp2);

    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        double nota1 = in.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = in.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = in.nextDouble();
        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        System.out.println("Sua média final é:");
        System.out.println(media);
    }

    public static void exe11() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor = in.nextInt();
        if (valor < 10) {
            System.out.println("NÃO É MAIOR QUE 10");
        } else {
            System.out.println("É MAIOR QUE 10");
        }
    }

    public static void exe12() {
        Scanner teste = new Scanner(System.in);
        System.out.println("Digite um valor:");
        double numero = teste.nextDouble();
        if (numero >= 0) {
            System.out.println("Valor positivo!!");
        } else {
            System.out.println("Valor negativo!!");
        }
    }

    public static void exe13() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de maçãs compradas:");
        double unidades = in.nextDouble();
        if (unidades < 12) {
            System.out.println("Valor da sua compra:");
            double total1 = unidades * 1.3;
            System.out.printf("R$%.2f", total1);
        } else {
            System.out.println("Valor da sua compra:");
            double total2 = unidades * 1;
            System.out.printf("R$%.2f", total2);

        }
    }

    public static void exe14() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o ano atual:");
        int atual = in.nextInt();
        System.out.println("Digite o ano que você nasceu:");
        int nasc = in.nextInt();
        if (atual - nasc < 15) {
            System.out.println("Você não poderá votar nesse ano!!");
        } else {
            System.out.println("Você poderá votar esse ano!!");

        }
    }
    public static void exe15() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor");
        int a = in.nextInt();
        System.out.println("Digite um valor:");
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a);
        }else {
            System.out.println(b);
    }
}
    public static void exe16() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int a = in.nextInt();
        System.out.println("Digite um valor:");
        int b = in.nextInt();
        if( a > b) {
            System.out.printf("%d , %d", b , a);
        } else {
            System.out.printf("%d , %d", a , b);
        }
    }
    public static void exe17() {
        Scanner in = new Scanner(System.in);
        System.out.println("Hora de início:");
        int inicio = in.nextInt();
        System.out.println("Hora do final");
        int fim = in.nextInt();
        int duracao = fim - inicio;
        if (duracao > 0) {
            System.out.printf("Duração da partida: %dH", duracao);
        } else if (duracao < 0) {
            int duracao1 = duracao * (-1);
            System.out.printf("Duração da partida: %dH", duracao1);
        }else{
            System.out.println("partida inválida");
        }
    }
}
