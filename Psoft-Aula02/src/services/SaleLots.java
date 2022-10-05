package services;

import models.*;
import repository.Repository;

public class SaleLots {
    private Repository repository;

    public SaleLots(Repository repository) {
        this.repository = repository;
    }

    public void createSalesLots(int qtd, String datav, String nomeProduto){

        Produto product = repository.getProduct(nomeProduto);
        Lote lot = new Lote(qtd, datav, product);
        repository.getSaleLots().put(product.getName(), lot);
    };

    public String listSalesLots() {
        return repository.getSaleLots().values().toString();
    }
}
