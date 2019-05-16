package factorySingleton;

import java.util.*;

public class Client {
    private List<ProductClass> products = new ArrayList<ProductClass>();
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


    public void add(ProductClass product){
        products.add(product);
    }
}
