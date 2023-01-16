package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class ProcessImageAbstract implements ImageStage {

    public ProcessImageAbstract() {

    }

    @Override
    public abstract void processImage(BufferedImage sourceImg, BufferedImage img, int n) throws IOException;
}
