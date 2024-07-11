<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
=======
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Arrays.stream(Class.forName("java.lang.String").getMethods()).forEach(System.out::println);
>>>>>>> 79d0121 (First commit)
    }
}