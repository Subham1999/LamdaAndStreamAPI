package task3;

import java.util.ArrayList;
import java.util.List;

public class FilterPalindromes{
    static List<String> listOfPalindromes;

    static final PalindromeChecker pc = any -> {
        StringBuffer anyTemp = new StringBuffer(any);
        return anyTemp.reverse().toString().equals(any);
    };

    public static void checkPalindromeAndInsert(String string){
        if(pc.check(string)) listOfPalindromes.add(string);
    }

    public List<String> filterPalindromes(List<String> listOfStrings){
        listOfPalindromes = new ArrayList<>();
        listOfStrings.forEach(FilterPalindromes::checkPalindromeAndInsert);
        return listOfPalindromes;
    }
}
