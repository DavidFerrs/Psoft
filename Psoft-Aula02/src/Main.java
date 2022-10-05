import facade.Facade;
import models.*;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.createProduct("Bicicleta", "Caloi", 497.00);
        String list = facade.listProducts();
        facade.createSalesLot(10,"21/12/20", "Bicicleta");
        String lotes = facade.listSalesLots();

        System.out.println(list);
        System.out.println(lotes);

    }
}
