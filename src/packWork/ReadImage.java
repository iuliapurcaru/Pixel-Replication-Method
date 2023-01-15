package packWork;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReadImage extends ReadImageAbstract {

    {
        System.out.println("Reading image from source.");
    }

    @Override
    public BufferedImage getImage(String file) throws IOException {

        long startTime = System.nanoTime();

        BufferedImage sourceImage = ImageIO.read(new File(file));

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to read image: " + elapsedTime/1000000 + " ms");

        return sourceImage;
    }

    @Override
    public BufferedImage processImage(String file) throws IOException {
        return null;
    }

    @Override
    public void writeImg(BufferedImage processedImg, String outFile) throws IOException {

    }


}
