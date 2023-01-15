package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class ProcessImageAbstract implements ImageStage {

    public ProcessImageAbstract() {

    }

    @Override
    public BufferedImage getImage(String file) throws IOException {

        return null;
    }

}
