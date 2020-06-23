package task1;

import java.util.List;

public class AverageOfListOfIntegers {
    static long sum;
    private static void accumulateSum(Integer num){
        sum += num;
    }
    public Long getAverage(List<Integer> listOfIntegers){
        sum = 0;
        listOfIntegers.stream().forEach(AverageOfListOfIntegers::accumulateSum);
        return sum / listOfIntegers.size();
    }
}
