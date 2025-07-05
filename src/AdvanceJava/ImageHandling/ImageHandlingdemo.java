package AdvanceJava.ImageHandling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandlingdemo {
    public static void main(String[] args) throws IOException {

        int width = 963;
        int height = 640;

        BufferedImage image = null;

        image = readFromFile(width, height, image);

        writeToFile(image);
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
        try {
            File sampleFile = new File("C:\\Users\\reete\\Downloads\\java-logo-3840x2160-15990.png");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            // Reading input file
            image = ImageIO.read(sampleFile);

            System.out.println("Reading complete. " + image);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return image;
    }

    private static void writeToFile(BufferedImage image) {
        try {
            File output = new File("D:\\RYTHM 25 JU\\out.png");
            ImageIO.write(image, "png", output);

            System.out.println("Writing complete");
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
}
