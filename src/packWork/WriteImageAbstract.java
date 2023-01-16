package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class WriteImageAbstract implements ImageStage {

    public WriteImageAbstract() {

    }

    @Override
    public abstract void writeImage(BufferedImage processedImg, String outFile) throws IOException;
}
