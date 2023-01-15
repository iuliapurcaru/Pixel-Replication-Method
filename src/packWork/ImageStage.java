package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface ImageStage {

    BufferedImage getImage(String file) throws IOException;
    void writeImg(BufferedImage processedImg, String outFile) throws IOException;
}
