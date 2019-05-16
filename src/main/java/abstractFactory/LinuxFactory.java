package abstractFactory;

public class LinuxFactory extends AbstractFileFactory{
    public AbstractFile createAbstractFile(){
        LinuxOrdinaryFile lo =new LinuxOrdinaryFile();
        return lo;
    }
}
