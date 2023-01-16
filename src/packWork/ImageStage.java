package packWork;

import java.awt.image.BufferedImage;

public interface ImageStage {

    static long startTime() {
        return 0;
    }

    static long endTime() {
        return 0;
    }

    static void elapsedTime(long startTime, long endTime) {

    }

    void counter();
}
