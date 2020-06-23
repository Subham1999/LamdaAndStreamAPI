package task2;

import java.util.ArrayList;
import java.util.List;

public class FilterStrings {
    public List<String> filterAllStrings(List<String> listOfStrings) {
        List<String> list = new ArrayList<>();
        listOfStrings.stream()
                .filter(string -> string.charAt(0) == 'a')
                .filter(string -> string.length() == 3)
                .forEach(string -> list.add(string));
        return list;
    }
}
