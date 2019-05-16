package abstractFactory;

public class FileSystemJ {
    public static void main (String[] args){
        AbstractFileFactory aff= AbstractFileFactory.getAbstractFileFactory();
        AbstractFile af= aff.createAbstractFile();
        af.setFileName("play");
        af.open();
    }
}
