package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class ProcessImage extends ProcessImageAbstract {

    static {
        System.out.println("Processing image.");
    }

    public ProcessImage() {

    }

    public static BufferedImage processImage(BufferedImage img, int n) throws IOException {

        long startTime = startTime();

        int w = n * img.getWidth();
        int h = n * img.getHeight();

        BufferedImage enlargedImg = new BufferedImage(w, h, img.getType());

        for (int y = 0; y < h; ++y) {
            for (int x = 0; x < w; ++x) {
                enlargedImg.setRGB(x, y, img.getRGB(x / n, y / n));
            }
        }

        long endTime = endTime();
        elapsedTime(startTime, endTime);

        return enlargedImg;

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
        System.out.println("Total execution time to process image: " + elapsedTime/1000000 + " ms");
    }

    @Override
    public void counter() {
        int counter = 0;
        counter++;
    }

}

