package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class ReadImageAbstract implements ImageStage {

    public ReadImageAbstract() {}

    public static BufferedImage readImage(String fileName, BufferedImage sourceImage) throws IOException {
        return null;
    }

    @Override
    public void counter() {
        int counter = 0;
        counter++;
    }


}
