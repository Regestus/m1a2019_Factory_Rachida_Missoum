package abstractFactory;

public abstract class AbstractFile {
    private String name;

    public String getName() {
        return name;
    }

    public abstract void open();

    public void setFileName(String filename){
        this.name=filename;
    }
}
