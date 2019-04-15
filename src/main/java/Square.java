public class Square extends Shapes {

    public Shapes createShape() {
        return null;
    }

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
