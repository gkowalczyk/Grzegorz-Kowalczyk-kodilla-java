import java.util.Arrays;

public class SumArrays {

    public static double sum(double[] numbers) {
        double sumArray;
        sumArray = Arrays.stream(numbers).sum();
        return sumArray;
    }

    // II solution
    public static double sum1(double[] numbers) {
        //II solution
        double sumArray = 0;
        for (double value : numbers) {
            sumArray = sumArray + value ;
        }
        return sumArray;
    }

}