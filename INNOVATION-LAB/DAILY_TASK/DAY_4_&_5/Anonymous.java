public class Anonymous {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class executing.....");
            }
        };

        task.run();
    }
}
