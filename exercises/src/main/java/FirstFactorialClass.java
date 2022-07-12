import java.util.Scanner;

public class FirstFactorialClass {


    public static int FirstFactorial(int num) {

        if (num > 0) {
            return num * (FirstFactorial(num -1));
        } else if (num == 0 || num == 1 ) {
            return 1;
        } else {
            throw new ArithmeticException("error");
        }
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
        System.gc();
    }

}

