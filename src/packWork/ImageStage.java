package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface ImageStage {

    void readImage(String fileName, BufferedImage img) throws IOException;
    void processImage(BufferedImage sourceImg, BufferedImage img, int n) throws IOException;
    void writeImage(BufferedImage processedImg, String outFile) throws IOException;
}
