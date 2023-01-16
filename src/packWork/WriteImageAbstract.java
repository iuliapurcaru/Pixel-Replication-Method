package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class WriteImageAbstract implements ImageStage {

    public WriteImageAbstract() {}

    public static void writeImage(BufferedImage processedImg) throws IOException {

    }

    @Override
    public void counter() {
        int counter = 0;
        counter++;
    }


}
