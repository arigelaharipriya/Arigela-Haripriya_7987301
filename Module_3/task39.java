import java.lang.reflect.Method;

public class task39 {

    public void show() {
        System.out.println("Method Invoked");
    }

    public static void main(String[] args)
            throws Exception {

        Class<?> c =
                Class.forName("task39");

        Object obj =
                c.getDeclaredConstructor()
                        .newInstance();

        Method m =
                c.getMethod("show");

        m.invoke(obj);
    }
}