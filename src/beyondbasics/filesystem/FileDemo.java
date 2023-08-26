package beyondbasics.filesystem;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("BeyondBasics/FileSystem");

        // isDirectory() - returns boolean value, it returns true if the file instance
        // is directory
        System.out.println(file.isDirectory());

        // list() - return a list of file name inside a directory
        String[] fileNames = file.list();
        for (String name : fileNames) {
            System.out.println(name);
        }

        File file1 = new File("BeyondBasics/FileSystem");
        System.out.println("File created: " + file1.createNewFile());
        System.out.println("Name of the file: " + file1.getName());
        System.out.println("Path of the file: " + file1.getPath());
        System.out.println("IsDirectory: " + file1.isDirectory());
        System.out.println("list: " + file1.list());
    }
}
