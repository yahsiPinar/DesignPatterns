import java.io.File;
import java.io.IOException;

public class FileClass {

    private static File file;
    private static FileClass instance;
    private FileClass() {
        file = new File("file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File created as: file.txt");
    }
    public static FileClass getFile(){
        if(instance == null){
            instance = new FileClass();
        }
        else
            System.out.println("file.txt already exists");
        return instance;
    }
}
