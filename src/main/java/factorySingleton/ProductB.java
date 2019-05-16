package factorySingleton;

public class ProductB extends ProductClass{
    static {
        Factory.registerProduct("factorySingleton.ProductB", new ProductB());
    }
    @Override
    public Product createProduct() {
        return new ProductB();
    }
    public void doIt(){
        System.out.println("I am a PorductB, doing it");
    }
}
