package packTest;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {

    static BufferedImage img = null;
    public static void main(String[] args) throws IOException {

        long startTime = System.nanoTime();
        System.out.println("Identifying source image.");
        String sourceImg = "source_images/img1.bmp";
        String processedImg = "processed_images/img1_resized.bmp";
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to identify source and destination image: " + elapsedTime + " ns");

//        ReadImage read1 = new ReadImage();
//        img = ReadImage.readImage(img1);
//        ReadImage2 read2 = new ReadImage2();
//        img = ReadImage2.readImage(img2);
//
//        ProcessImage process = new ProcessImage();
//        img = ProcessImage.enlargeImage(img, 4);
//
//        WriteImage write = new WriteImage();
//        WriteImage.writeImg(img, processedImg1);

    }
}
