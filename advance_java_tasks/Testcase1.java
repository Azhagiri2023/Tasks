import java.util.stream.*;

public class Testcase1 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println("before converting the values are");
        names.forEach(System.out::println);
        Stream<String> names1 = Stream.of("aBc", "d", "ef");
        System.out.println("after converting the values are");
        names1
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}