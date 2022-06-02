package classes.lanches;

public abstract class Lanche {
    public String[] ingredientes = new String[10];
    public double valor;

    public String tipo;

    public void adicionarIngrediente(String ingrediente) {
        for (int i = 0; i < 10; i++) {
            if(this.ingredientes[i] == null) {
                this.ingredientes[i] = ingrediente;
                break;
            }
        }
    }
}
