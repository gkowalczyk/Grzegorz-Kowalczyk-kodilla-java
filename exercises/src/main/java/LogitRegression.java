import java.util.Scanner;

public class LogitRegression {

    //Have the function LogitRegression(arr) read the input array of 4 numbers x, y, a, b, separated by space, and return an output of two numbers for updated a and b (assume the learning rate is 1). Save up to 3 digits after the decimal points for a and b. The output should be a string in the format: a, b
    //
    //Logistic regression is a simple approach to do classification, and the same formula is also commonly used as the output layer in neural networks. We assume both the input and output variables are scalars, and the logistic regression can be written as:
    //
    //y = 1.0 / (1.0 + exp(-ax - b))
    //
    //After observing a data example (x, y), the parameter a and b can be updated using gradient descent with a learning rate.

    public static String LogitRegression(double[] arr) {



        double x = arr[0];
        double y = arr[1];
        double a = arr[2];
        double b = arr[3];

        y = (1.0 / (1.0 + Math.exp(-a * x - b)));

        double deltaA = x * (arr[1] - y);
        double deltaB = arr[1] - y;

        a -= deltaA;
        b -= deltaB;
        a = (Math.round(a * 1000.0) / 1000.0);
        b = (Math.round(b * 1000.0) / 1000.0);
        return a + ", " + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(LogitRegression(new double[] {1, 1, 1, 1}));
    }
}
