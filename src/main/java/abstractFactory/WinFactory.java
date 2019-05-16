package abstractFactory;

public class WinFactory extends AbstractFileFactory {
    public AbstractFile createAbstractFile(){
        WinOrdinaryFile wo =new WinOrdinaryFile();
         return wo;
    }
}
