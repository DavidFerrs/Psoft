package repository;
import java.util.*;
import models.*;

public class Repository {
    private final Map<String, Produto> products = new HashMap<String, Produto>();
    private final Map<String, Lote> saleLots = new HashMap<String, Lote>();


    public Map getProducts() {
        return products;
    }

    public Produto getProduct(String name){
        return products.get(name);
    }

    public Map getSaleLots() {
        return saleLots;
    }
}
