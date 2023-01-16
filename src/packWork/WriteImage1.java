package packWork;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WriteImage1 extends WriteImageAbstract{

    public WriteImage1() {
        System.out.println("Writing image 1 to destination.");
    }

    public static void writeImage(BufferedImage processedImg) throws IOException {

        long startTime = startTime();

        File outputfile = new File("processed_images/img1_resized.bmp");
        ImageIO.write(processedImg, "bmp", outputfile);

        long endTime = endTime();
        elapsedTime(startTime, endTime);
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
        System.out.println("Total execution time to write image 1: " + elapsedTime/1000000 + " ms");
    }

}
