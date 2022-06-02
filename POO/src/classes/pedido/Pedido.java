package classes.pedido;

import classes.lanches.*;

public class Pedido {

    private Lanche[] lanches = new Lanche[10];

    public void imprimirComanda() {

        /*
        *
        }*/
        /*
        *PIZZA
        *
         */
        /*
        *SANDUICHE
        * if (this.adicionais[0] != null) {
            System.out.println("-ADICIONAIS-");
            for (String adicional : this.adicionais) {
                if (adicional != null) {
                    System.out.println(adicional);
                }
            }
         */
        /*
        *XBURGUER
        *
         */
        for (Lanche l: this.lanches) {
            if (l != null) {
                if (l instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) l);
                }
            System.out.println("===="+mp.getTipo()+" - "+mp.getSabor()+"====");
                if (l instanceof Pizza) {
                    System.out.println("Tamanho: "+((Pizza)l).getTamanho());
        } else {
            System.out.println("====" + l.getTipo()+ "====");
                }
                if (l instanceof XBurguer) {
                    if (((XBurguer) l).isAberto()) {
                        System.out.println("-- LANCHE ABERTO --");
                    }
                }
        System.out.printf("Valor: R$%.2f\n", l.getValor());
        System.out.println("-INGREDIENTES-");
        for (String ingrediente: l.getIngredientes()) {
            if (ingrediente != null) {
                System.out.println(ingrediente);
            }
            }
            if (l instanceof Sanduiche) {
                Sanduiche s = (Sanduiche) l;
                if (s.adicionais[0] != null) {
                    System.out.println("-ADICIONAIS-");
                    for (String adicional : s.adicionais) {
                        if (adicional != null) {
                            System.out.println(adicional);
                        }
                    }
            }
        }
                System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
                System.out.println("---------------------------");
    }

    public double calcularValorTotal() {
        double vlrTotal = 0;
        for (Lanche l : this.getLanches()) {
            if (l != null) {
                vlrTotal += l.getValor();
            }
    }
        return vlrTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        for (int i = 0; i < 10; i++) {
            if(this.lanches[i] == null) {
                this.lanches[i] = lanche;
                break;
            }
        }
    }

    public Lanche[] getLanches() {
        return this.lanches;
    }
}
