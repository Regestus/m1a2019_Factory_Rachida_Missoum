public class Client {
    public Client(){
        prodA = new ProductA();
    }
    public void foo(){
        prodA.doyourstuff();
        ProductB myProdB = new ProductB();
        myProdB.doIt();
        ProductC myProdC = new ProductC();
        myProdC.perform();
    }
    ProductA prodA;
    ProductB prodB;
}
