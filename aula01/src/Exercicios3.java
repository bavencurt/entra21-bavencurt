public class Exercicios3 {
     public static void main(String[] args) {
        String[] palavras = {"bruno", "def", "gha"};
        char letraProibida = 'a';
        boolean achou = false;
        for (String palavra : palavras){
            for (int i = 0; i < palavra.length(); i++) {
                achou = palavra.charAt(i) == letraProibida;
                if (achou) {
                    break;
                }
            }
            if (achou) {
                break;
            }System.out.println(palavra);
        }
        if (achou) {
            System.out.println("Encontrou letra proibida");
        } else {
            System.out.println("Não encontrou letra proibida");
        }
    }

}
