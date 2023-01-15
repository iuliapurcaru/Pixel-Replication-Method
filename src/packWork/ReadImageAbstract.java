package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class ReadImageAbstract implements ImageStage {

    public ReadImageAbstract() {

    }

    @Override
    public BufferedImage getImage(String file) throws IOException {

        return null;
    }

    public abstract BufferedImage processImage(String file) throws IOException;
}
