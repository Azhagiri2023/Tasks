import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Testcase3 {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("Azhagiri","Mani","krish","Arun","Amma","Mother","Selva");
        List<String> outputStr = listString.stream()
                                 .filter(n -> n.startsWith("A"))
                                 .collect(Collectors.toList());
        outputStr.forEach(System.out::println);
    }
}