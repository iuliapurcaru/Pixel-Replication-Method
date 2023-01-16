package packTest;

public class Input extends Thread {

    public void start(){
        System.out.println("Choose what image you want to enlarge (1, 2, 0 for exit): ");
    }
    public void run() {
        System.out.println("Choose how many times you want to enlarge the image: ");
    }
}
