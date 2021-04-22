public class ThreadWork {
    public static String[] type = { "1-10", "10-1", "a-k", "k-a" };
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            try {
                new Thread(getRunnable(), type[i]).start();
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Runnable getRunnable() {
        return () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    if (Thread.currentThread().getName().equals("1-10")) {
                        System.out.println(Thread.currentThread().getName() + ": " + (i + 1));
                    } else if (Thread.currentThread().getName().equals("10-1")) {
                        System.out.println(Thread.currentThread().getName() + ": " + (10 - i));
                    } else if (Thread.currentThread().getName().equals("a-k")) {
                        System.out.println(Thread.currentThread().getName() + ": " + ((char)(i + 97)));
                    } else if (Thread.currentThread().getName().equals("k-a")) {
                        System.out.println(Thread.currentThread().getName() + ": " + ((char)(106 - i)));
                    }
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };
    }
}
