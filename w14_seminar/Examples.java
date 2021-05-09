public class Examples {
    public static String[] type = { "a", "b" };
    public static void main(String[] args) {
        // String str = "string";
        // str += "123";
        // str.concat(" rewrite");
        // String str2 = str.concat(" rewrite");
        // System.out.println(str);
        // System.out.println(str2);

        String abc = "abc";
        abc += "123";
        String abc2 = "abc";
        abc2 += "123";

        System.out.println(abc == abc2);
        System.out.println(abc == "abc123");
        System.out.println(abc.equals(abc2));

        // StringBuffer sbf = new StringBuffer();
        // sbf.append("StringBfr");
        // sbf.insert(7, "uf");
        // sbf.insert(10, "e");

        // for (int i = 0; i < 2; i++) {
        //     try {
        //         new Thread(getRunnable(sbf), type[i]).start();
        //         Thread.sleep(500);
        //     } catch (Exception e) {
        //         System.out.println(e.getMessage());
        //     }
        // }

        // StringBuilder sb = new StringBuilder();
        // sb.append("StringBldr");
        // System.out.println(sb);
        // sb.insert(7, "ui");
        // sb.insert(11, "e");
        // System.out.println(sb);
    }

    public static Runnable getRunnable(StringBuffer sb) {
        return () -> {
            for (int i = 0; i < sb.length() * 1.5; i++) {
                try {
                    if (Thread.currentThread().getName().equals("a")) {
                        sb.deleteCharAt(sb.length() - 1);
                        System.out.println(sb);
                    }
                    if (Thread.currentThread().getName().equals("b")) {
                        sb.deleteCharAt(0);
                        System.out.println(sb);
                    }
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };
    }
}