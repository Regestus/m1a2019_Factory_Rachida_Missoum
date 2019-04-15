public class Square extends Shapes {

    public void move(int dX, int dY) {

    }

    static{
        ShapesFactory.registerShape("Square",new Square());
    }
    @Override
    public Shapes createShape(){
        return new Square();
    }
}
