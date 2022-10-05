package facade;

import models.Produto;
import repository.Repository;
import services.Products;
import services.SaleLots;

public class Facade {

    private Repository repository = new Repository();
    private Products productsService = new Products(repository);
    private SaleLots saleLotsService = new SaleLots(repository);

    public void createProduct(String nome, String fabricante, double preco){
        productsService.createProduct(nome, fabricante, preco);
    };
    public void createSalesLot(int qtd, String datav, String produto){
        saleLotsService.createSalesLots(qtd, datav, produto);
    };
    public String listProducts(){
        return productsService.listProducts();

    };
    public String listSalesLots(){
        return saleLotsService.listSalesLots();
    };
}
