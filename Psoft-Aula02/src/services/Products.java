package services;

import models.Produto;
import repository.Repository;

import java.util.List;

public class Products {
    private Repository repository;

    public Products(Repository repository) {
        this.repository = repository;
    }

    public void createProduct(String nome, String fabricante, double preco) {
        Produto product = new Produto(nome, fabricante, preco);
        repository.getProducts().put(product.getName(), product);
    }

    public String listProducts(){
        return repository.getProducts().values().toString();
    }

}
