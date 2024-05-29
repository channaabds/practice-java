import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        class File_notFound_Demo {
            public static void main(String[] args) {
                try {
                    // Followwing file does not exist
                    File file = new File("file.txt");

                    FileReader fr = new  FileReader(file);
                } catch (FileNotFoundException e) {
                    System.out.println("File Does't exist");
                }
            }
        }
    }
}
