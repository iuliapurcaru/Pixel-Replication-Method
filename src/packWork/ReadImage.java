package packWork;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReadImage {

    public ReadImage() {
        System.out.println("Reading image from source.");
    }

    public static BufferedImage readImage (String file) throws IOException {

        long startTime = System.nanoTime();

        BufferedImage sourceImage = ImageIO.read(new File(file));

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to read image: " + elapsedTime/1000000 + " ms");

        return sourceImage;
    }

}
