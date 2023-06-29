package ch09.ricky.factory;

public class FactoryClient {

    public static void main(String[] args) {
        ProductFactory.Product p = ProductFactory.createProduct("loan");
    }
}
