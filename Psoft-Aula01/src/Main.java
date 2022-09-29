import models.*;

public class Main {
    public static void main(String[] args) {
        Produto bike = new Produto("Bicicleta","Caloi",397.90);
        Lote lote01 = new Lote(12, "27/10/2022",bike);
        System.out.println(lote01);
    }
}
