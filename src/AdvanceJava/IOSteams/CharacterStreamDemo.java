package AdvanceJava.IOSteams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("C:\\Users\\reete\\OneDrive\\Desktop\\Java-Tutorial\\source.txt");
            writer = new FileWriter("C:\\Users\\reete\\OneDrive\\Desktop\\Java-Tutorial\\dest.txt");

            // Reading source file and writing content to target file character by character
            int content;
            while ((content = reader.read()) != -1) {
                writer.append((char) content);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }

        }
    }
}
