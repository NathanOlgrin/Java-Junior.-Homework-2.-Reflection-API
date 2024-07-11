import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Arrays.stream(Class.forName("java.lang.String").getMethods()).forEach(System.out::println);
    }
}