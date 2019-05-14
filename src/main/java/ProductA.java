import java.util.*;

public class ProductA extends ProductClass {
    static {
        Factory.registerProduct("ProductA", new ProductA());
    }
    @Override
    public Product createProduct() {
        return new ProductA();
    }
    public void doyourstuff(){
        System.out.println(" I am a ProductA, doing my stuff");
    }

}
