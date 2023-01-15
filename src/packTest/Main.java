package packTest;

import packWork.ProcessImage;
import packWork.ReadImage;
import packWork.WriteImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    static BufferedImage img = null;
    static File outputfile = null;
    public static void main(String[] args) throws IOException {

        long startTime = System.nanoTime();
        System.out.println("Identifying source images.");
        String img1 = "sourceImg/cat.bmp";
        String img2 = "sourceImg/park.bmp";
        String processedImg1 = "processedImg/catPr.bmp";
        String processedImg2 = "processedImg/parkPr.bmp";
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to identify source and destination images: " + elapsedTime + " ns");

        ReadImage read = new ReadImage();
        img = ReadImage.readImage(img1);

        ProcessImage process = new ProcessImage();
        img = ProcessImage.enlargeImage(img, 4);

        WriteImage write = new WriteImage();
        WriteImage.writeImg(img, processedImg1);

    }
}
