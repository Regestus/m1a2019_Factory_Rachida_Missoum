public class Main {
    static{
        try{
            Class.forName("shapes.Client");
            Class.forName("shapes.Square");
        }
        catch(ClassNotFoundException any){
            any.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Client c = new Client();
        ShapesFactory instance = ShapesFactory.getInstance();
    }
}
