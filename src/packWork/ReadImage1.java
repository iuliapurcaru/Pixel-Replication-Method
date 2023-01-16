package packWork;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReadImage1 extends ReadImageAbstract {

    {
        System.out.println("Reading image 1 from source.");
    }

    public ReadImage1() throws IOException {

    }

    public static BufferedImage readImage() throws IOException {

        BufferedImage sourceImage;
        long startTime = startTime();
        sourceImage = ImageIO.read(new File("source_images/img1.bmp"));
        long endTime = endTime();
        elapsedTime(startTime, endTime);

        return sourceImage;

    }

    public static long startTime() {

        long startTime = System.nanoTime();
        return startTime;
    }

    public static long endTime() {

        long endTime = System.nanoTime();
        return endTime;
    }

    public static void elapsedTime(long startTime, long endTime) {

        long elapsedTime = endTime - startTime;
        System.out.println("Total execution time to read image 1: " + elapsedTime/1000000 + " ms");
    }
}
