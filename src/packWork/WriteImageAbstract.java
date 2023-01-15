package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class WriteImageAbstract implements ImageStage {

    public WriteImageAbstract() {

    }

    public abstract BufferedImage processImage(String file) throws IOException;

    @Override
    public void writeImg(BufferedImage processedImg, String outFile) throws IOException {

    }
}
