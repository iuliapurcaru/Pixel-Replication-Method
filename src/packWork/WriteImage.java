package packWork;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WriteImage {

    {
        System.out.println("Writing image to destination.");
    }

    public WriteImage() {

    }

    public static void writeImage(BufferedImage processedImg, String outFile) throws IOException {

        long startTime = System.nanoTime();

        File outputfile = new File(outFile);
        ImageIO.write(processedImg, "bmp", outputfile);

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to write image: " + elapsedTime/1000000 + " ms");
    }

}
