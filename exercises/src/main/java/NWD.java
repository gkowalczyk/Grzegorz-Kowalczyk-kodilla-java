public class NWD {

    // I


    private final int calculate(int a, int b) {

        while (a != b) {

            if (a > b) {

                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    // II


private final int calculateWithUseRecursive(int a, int b) {

    if (a != b) {
        return calculateWithUseRecursive(a > b ? a - b :a,b>a ? b -a :b);

    }
        return a;
    }


    public static void main(String[] args) {
        NWD nwd = new NWD();
        System.out.println("NWD=" + nwd.calculateWithUseRecursive(8,12));
    }
}
