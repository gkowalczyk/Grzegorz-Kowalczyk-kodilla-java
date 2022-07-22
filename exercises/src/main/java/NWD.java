public class NWD {

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

    public static void main(String[] args) {
        NWD nwd = new NWD();
        System.out.println("NWD=" + nwd.calculate(12,18));
    }
}
