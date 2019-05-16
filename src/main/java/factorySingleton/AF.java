package factorySingleton;

public class AF {
    public static void main(String[] args) {
        Client client = new Client();
        Factory instance = Factory.getInstance();
        client.add((ProductClass) instance.createProduct("factorySingleton.ProductA"));
        client.add((ProductClass) instance.createProduct("factorySingleton.ProductB"));
        client.add((ProductClass) instance.createProduct("factorySingleton.ProductC"));
        client.foo();
    }
}