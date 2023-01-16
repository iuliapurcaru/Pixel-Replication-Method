package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class ProcessImageAbstract implements ImageStage {

    public ProcessImageAbstract() {}

    public static BufferedImage processImage(BufferedImage img, int n) throws IOException {
        return null;
    }

    @Override
    public void counter() {
        int counter = 0;
        counter++;
    }


}
