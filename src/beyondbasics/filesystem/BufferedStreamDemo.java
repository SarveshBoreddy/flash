package beyondbasics.filesystem;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        FileInputStream inFile = new FileInputStream("BeyondBasics/FileSystem/InFile.txt");
        int value = inFile.read();
        while (value != -1) {
            value = inFile.read();
        }
        System.out.println("Time taken - " + (System.currentTimeMillis() - startTime));
        inFile.close();

        startTime = System.currentTimeMillis();
        BufferedInputStream inFile1 = new BufferedInputStream(
                new FileInputStream("BeyondBasics/FileSystem/InFile.txt"));
        int value1 = inFile1.read();
        while (value1 != -1) {
            value1 = inFile1.read();
        }
        System.out.println("Time taken - " + (System.currentTimeMillis() - startTime));
        inFile1.close();
    }
}
