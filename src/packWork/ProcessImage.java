package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class ProcessImage extends ProcessImageAbstract{

    static {
        {
            System.out.println("Processing image 1.");
        }
    }
    public ProcessImage(){
        //System.out.println("Processing image.");
    }

    public static BufferedImage enlargeImage(BufferedImage image, int n) throws IOException {

        long startTime = System.nanoTime();

        int w = n * image.getWidth();
        int h = n * image.getHeight();

        BufferedImage enlargedImage = new BufferedImage(w, h, image.getType());

        for (int y = 0; y < h; ++y) {
            for (int x = 0; x < w; ++x) {
                enlargedImage.setRGB(x, y, image.getRGB(x / n, y / n));
            }
        }

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to process image: " + elapsedTime/1000000 + " ms");

        return enlargedImage;

    }

    @Override
    public void writeImg(BufferedImage processedImg, String outFile) throws IOException {

    }
}
