import java.util.Locale;
import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

   String var3 = "Did you know about the aclaimed MMO FFXIV";
        int qtde = 0;
        for (int i = 0; i < var3.length(); i++) {
            if(var3.toLowerCase().charAt(i) == 'a') {
                qtde++;
            }
        }
        System.out.println(qtde);

        System.out.println(var3.length()); // retorna a quantidade total de caracteres no texto
        System.out.println(var3.charAt(4));// charAt() retorna o caractere na posição x do texto
        System.out.println(var3.equals("teste")); // equals() realiza comparação entre Strings
        System.out.println(var3.toLowerCase()) ; // converte todos os caracteres da String para minúsculo
        System.out.println(var3.toUpperCase()); //converte todos para maiúsculo
        System.out.println(var3.contains("FFXIV")); // checa se o texto informado contém a String do parâmetro
       String[] splitted = var3.split(" "); // ira quebrar o texto no delimitador informado e retornara uma lista dos textos
        System.out.println(var3.strip());// remove os espaços do começo e do final do texto
        for (String word : splitted) {
            System.out.println(word);
        }
        System.out.println(var3.substring(5, 8));


    //array
    int[] numeros = {0,1,2,3,4,5,6,7,8,9}; // iniciando uma lista com valores
    int[] numeros2 = new int[10];{
        System.out.println(numeros[6]); //recuperando um valor da lista
        numeros2[4] = in.nextInt(); // inserindo um valor no array
        System.out.println(numeros.length); //pegando a quantidade de itens
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    int[][] numers3 = {{0,1,2,3,4},{5,6,7,8,9}};// iniciando uma matriz com valores
    int[][] numers4 = new int[2][5]; //iniciando uma matriz sem valores
            System.out.println(numers3[0] [2]);// recuperando um valor de matriz
     numers4[1] = new int[] {7,8,9,0}; // inserindo uma lista em uma linha
     numers4[0][0] = 9; //inserindo dados em uma posição da matriz
            System.out.println(numers3.length);//numero de linhas da matriz
            System.out.println(numers3[0].length); //quantidade de itens na linha da matriz

            for (int i = 0; i < numers3.length; i++) {
                for(int j = 0; j < numers3[i].length; j++){
                    System.out.println(numers3[i][j]); //tamanho da matriz
                }
            }


}}}
