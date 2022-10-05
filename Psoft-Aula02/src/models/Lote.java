package models;

public class Lote {
    private final int qtd;
    private final String datav;
    private final Produto produto;

    public Lote(int qtd, String datav, Produto produto) {
        this.qtd = qtd;
        this.datav = datav;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Lote -> " +
                "qtd:" + qtd +
                ", datav:'" + datav + '\'' +
                ", produto:" + produto ;
    }
}
