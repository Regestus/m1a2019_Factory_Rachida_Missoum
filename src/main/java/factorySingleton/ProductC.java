package factorySingleton;

public class ProductC extends ProductClass{
    static {
        Factory.registerProduct("factorySingleton.ProductC", new ProductC());
    }
    @Override
    public Product createProduct() {
        return new ProductC();
    }
    public void perform(){
        System.out.println("I am a factorySingleton.ProductC, performing");
    }
}
