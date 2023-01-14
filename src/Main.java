import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedImage img = ImageIO.read(new File("img/cat.bmp"));

        ReadImage readImg = new ReadImage();
        BufferedImage bi = readImg.enlargeImage(img, 4);

        File outputfile = new File("img/saved.png");
        ImageIO.write(bi, "png", outputfile);
    }
}
