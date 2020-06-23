import java.io.File;
import java.io.IOException;

public class FileDeleteProgram {

    public static void main(String[] args) throws IOException {
        File directory = new File("/Users/rutuldarji/Documents/Study Time/GeeksForGeeksPrograms/src/dummyFiles");
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file: files) {
                if(!file.delete()) {
                    System.out.println("can't Delete " + file);
                }
            }
        } else {
            System.out.println("No Such Dire ");
        }

    }
}
