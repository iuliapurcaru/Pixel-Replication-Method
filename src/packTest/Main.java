package packTest;

import packWork.ProcessImage;
import packWork.ReadImage1;
import packWork.WriteImage1;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        long startTime = System.nanoTime();
        System.out.println("Identifying source image.");
        String sourceImg = "source_images/img1.bmp";
        String processedImg = "processed_images/img1_resized.bmp";
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to identify source and destination image: " + elapsedTime + " ns");

        BufferedImage sourceImage = null;
        BufferedImage enlargedImage = null;

        ReadImage1 read = new ReadImage1();
        sourceImage = read.readImage();

        ProcessImage process = new ProcessImage();
        enlargedImage = process.processImage(sourceImage, 2);

        WriteImage1 write = new WriteImage1();
        WriteImage1.writeImage(enlargedImage);

    }
}
