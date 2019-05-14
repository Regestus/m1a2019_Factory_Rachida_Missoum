public class AF {
    public static void main(String[] args) {
        Client client = new Client();
        Factory instance = Factory.getInstance();
        client.add((Product) instance.createProduct("ProductA"));
        client.add((Product) instance.createProduct("ProductB"));
        client.add((Product) instance.createProduct("ProductC"));
        client.foo();
    }
}