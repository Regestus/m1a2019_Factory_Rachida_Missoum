package factorySingleton;

import java.util.HashMap;
import java.util.Map;


public class Factory {
    private static Map<String, Product> registry = new HashMap<String, Product>();
    private static Factory instance = null;

    public static void registerProduct(String name, Product product){
        registry.put(name, product);
    }
    public static synchronized Factory getInstance()
    {
        if (instance == null)
        {
            instance = new Factory();
        }
        return instance;
    }

    public Product createProduct(String name){
        return registry.get(name).createProduct();
    }
}
