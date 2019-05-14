public class AF {
    public static void main(String[] args) {
        Client client = new Client();
        Factory instance = Factory.getInstance();
        client.add((ProductClass) instance.createProduct("ProductA"));
        client.add((ProductClass) instance.createProduct("ProductB"));
        client.add((ProductClass) instance.createProduct("ProductC"));
        client.foo();
    }
}