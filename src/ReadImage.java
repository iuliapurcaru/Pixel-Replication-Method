import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReadImage {

    ReadImage() {

    }

    public static BufferedImage enlargeImage(BufferedImage image, int n) throws IOException {

        int w = n * image.getWidth();
        int h = n * image.getHeight();

        BufferedImage enlargedImage = new BufferedImage(w, h, image.getType());

        for (int y = 0; y < h; ++y) {
            for (int x = 0; x < w; ++x) {
                enlargedImage.setRGB(x, y, image.getRGB(x / n, y / n));
            }
        }
        return enlargedImage;

    }

}
