package packWork;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReadImage {

    {
        System.out.println("Reading image from source.");
    }

    public ReadImage() throws IOException {

    }

    public static BufferedImage readImage(String fileName, BufferedImage sourceImage) throws IOException {

        long startTime = System.nanoTime();

        sourceImage = ImageIO.read(new File(fileName));

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to read image: " + elapsedTime/1000000 + " ms");

        return sourceImage;

    }

}
