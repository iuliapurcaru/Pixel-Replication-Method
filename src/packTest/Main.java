package packTest;

import packWork.*;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        long startTime = System.nanoTime();
        System.out.println("Identifying source image.");
        String sourceImg = "source_images/img1.bmp";
        String processedImg = "processed_images/img1_resized.bmp";
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to identify source and destination image: " + elapsedTime + " ns");

        BufferedImage sourceImage;
        BufferedImage enlargedImage;

        Input thread = new Input();

        thread.start();
        Scanner keyboard = new Scanner(System.in);
        int inputImage = keyboard.nextInt();

        thread.run();
        keyboard = new Scanner(System.in);
        int inputResize = keyboard.nextInt();


        switch(inputImage) {
            case 0:
                break;
            case 1:
                ReadImage1 read1 = new ReadImage1();
                sourceImage = read1.readImage();

                ProcessImage process1 = new ProcessImage();
                enlargedImage = process1.processImage(sourceImage, inputResize);

                WriteImage1 write1 = new WriteImage1();
                write1.writeImage(enlargedImage);

                inputImage = 0;

                break;
            case 2:
                ReadImage2 read2 = new ReadImage2();
                sourceImage = read2.readImage();

                ProcessImage process2 = new ProcessImage();
                enlargedImage = process2.processImage(sourceImage, inputResize);

                WriteImage2 write2 = new WriteImage2();
                write2.writeImage(enlargedImage);

                inputImage = 0;

                break;
            default:
                System.out.println("Invalid input.");
                thread.start();
                keyboard = new Scanner(System.in);
                inputImage = keyboard.nextInt();
                thread.run();
                keyboard = new Scanner(System.in);
                inputResize = keyboard.nextInt();
        }
    }
}
