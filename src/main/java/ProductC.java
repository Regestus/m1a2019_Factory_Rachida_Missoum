public class ProductC extends ProductClass{
    static {
        Factory.registerProduct("ProductC", new ProductC());
    }
    @Override
    public Product createProduct() {
        return new ProductC();
    }
    public void perform(){
        System.out.println("I am a ProductC, performing");
    }
}
