package packWork;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WriteImage extends WriteImageAbstract {

    {
        System.out.println("Writing image to destination.");
    }

    @Override
    public BufferedImage getImage(String file) throws IOException {
        return null;
    }

    @Override
    public BufferedImage processImage(String file) throws IOException {
        return null;
    }

    public void writeImg(BufferedImage processedImg, String outFile) throws IOException {

        long startTime = System.nanoTime();

        File outputfile = new File(outFile);
        ImageIO.write(processedImg, "bmp", outputfile);

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to write image: " + elapsedTime/1000000 + " ms");
    }
}
