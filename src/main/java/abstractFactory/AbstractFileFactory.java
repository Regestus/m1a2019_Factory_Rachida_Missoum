package abstractFactory;

public abstract class AbstractFileFactory {

    public static AbstractFileFactory getAbstractFileFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if(sys==0){
            return new WinFactory();
        }
        else
        {
            return new LinuxFactory();
        }
    }

    public abstract AbstractFile createAbstractFile();
}
