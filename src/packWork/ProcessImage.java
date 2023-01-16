package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class ProcessImage {

    static {
        System.out.println("Processing image.");
    }

    public ProcessImage() {

    }

    public static BufferedImage processImage(BufferedImage enlargedImg, BufferedImage img, int n) throws IOException {

        long startTime = System.nanoTime();

        int w = n * img.getWidth();
        int h = n * img.getHeight();

        enlargedImg = new BufferedImage(w, h, img.getType());

        for (int y = 0; y < h; ++y) {
            for (int x = 0; x < w; ++x) {
                enlargedImg.setRGB(x, y, img.getRGB(x / n, y / n));
            }
        }

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to process image: " + elapsedTime / 1000000 + " ms");

        return enlargedImg;

    }
}

