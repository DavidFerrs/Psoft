package models;


public class Produto {
    private final String name;
    private final String fabricante;
    private double price;

    public Produto(String nome, String fabricante, double preco){
        this.name = nome;
        this.fabricante = fabricante;
        this.price = preco;
    }

    public String getName() {
        return name;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "(name:'" + name + '\'' +
                ", fabricante:'" + fabricante + '\'' +
                ", price:" + price +
                ')';
    }
}
