package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class ReadImageAbstract implements ImageStage {

    public ReadImageAbstract() {

    }
    @Override
    public abstract void readImage(String fileName, BufferedImage img) throws IOException;

}
