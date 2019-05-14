import java.util.*;

public class Client {
    private List<Product> products = new ArrayList<Product>();
    private ProductA productA;

    public Client() {
        productA = new ProductA();
    }
    public void foo() {
        productA.doyourstuff();
        ProductB productB = new ProductB();
        productB.doIt() ;
        ProductC productC = new ProductC();
        productC.perform();
    }


    public void add(Product product){
        products.add(product);
    }
}
