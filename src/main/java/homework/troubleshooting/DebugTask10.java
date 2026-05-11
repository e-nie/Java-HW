package homework.troubleshooting;

import java.util.*;
public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
//        for (String name : names) {
//            if (name.startsWith("A")) {
//                names.remove(name);
//            }
//        }
        names.removeIf(name-> name.startsWith("A"));
        System.out.println(names);
    }
}



