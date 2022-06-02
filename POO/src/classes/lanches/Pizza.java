package classes.lanches;

public class Pizza extends MiniPizza{
    private String tamanho;

    public Pizza() {
        this.tipo = "Pizza";
    }


    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return this.tamanho;
    }
}
