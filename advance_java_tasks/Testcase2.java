import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Testcase2 {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        List<String> outputStr = listString.stream()
                                 .filter(n -> n!="")
                                 .map( n -> n)
                                 .collect(Collectors.toList());
        outputStr.forEach(System.out::println);
    }
}