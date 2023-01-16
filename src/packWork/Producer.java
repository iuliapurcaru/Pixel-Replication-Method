package packWork;

class Producer extends Thread {
    private Buffer buffer;
    public Producer(Buffer b) {
        buffer = b;
    }
    public void run () {
        for(int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("Producatorul a pus :\t" + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {}
        }
    }
}

