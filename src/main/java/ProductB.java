public class ProductB implements Product{
    static {
        Factory.registerProduct("ProductB", new ProductB());
    }
    @Override
    public Product createProduct() {
        return new ProductB();
    }
    public void doIt(){
        System.out.println("I am a PorductB, doing it");
    }
}
