public class task40 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            Thread t =
                    new Thread(() ->
                            System.out.println(
                                    "Thread Running"));

            t.start();
        }
    }
}