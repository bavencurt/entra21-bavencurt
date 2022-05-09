import java.util.Scanner;

public class DesafioXXIV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean whatclass = true;
        while (whatclass) {
            System.out.print("Informe a abreviação do personagem:");
            String clazz = in.next();
            if (clazz.length()!=3) {
                System.out.println("Não é uma abreviação válida:");
            }else{
                switch (clazz.toUpperCase()) {
                case "PLD","WAR","DKN","GNB":
                    System.out.println("TANK!");
                    break;
                case "WHM","SCH","AST","SAG":
                    System.out.println("HEALER!!");
                    break;
                case "MNR","DRG","NJA","SMR","RPR","BRD","MCH","DNC","BLM","SMN","RDM","BEM":
                    System.out.println("DPS!!");
                    break;
                default:
                    System.out.println("Não é um personagem válido");
                    whatclass = false;
            }
        }
    }
}
    }
