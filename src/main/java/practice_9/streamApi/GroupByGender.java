package practice_9.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGender {

    //Список строк с именами и полом "John: M", "Sarah: F"
    // сгруппировать по полу в мапу Map<String>, List<String>
    //                               пол         список имен

    static void main(String[] args) {
        List<String> names = Arrays.asList("John: M", "Sarah: F", "Leyla: F", "Nick: M");

        Map<String, List<String>> groupedByGender = names.stream()
                .collect(Collectors.groupingBy(n -> {
                            System.out.println("Key before transformation: " + n);
                            System.out.println("Key after transformation: " + n.split(":")[1]);
                            return n.split(":")[1];
                        },
                        Collectors.mapping(name -> {
                                    System.out.println("value before transformation: " + name);
                                    System.out.println("value after transformation: " + name.split(":")[0]);
                                    return name.split(":")[0];
                                },
                                Collectors.toList())));
        System.out.println(groupedByGender);
    }
}
