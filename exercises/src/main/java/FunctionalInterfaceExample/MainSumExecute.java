package FunctionalInterfaceExample;
//http://devfoundry.pl/wyrazenia-lambda-i-interfejsy-funkcyjne/
public class MainSumExecute {
    public static void main(String[] args) {

        Sum sum = (a, b) -> a + b;  //(a,b) parametry metody   a+b - ciało metody
        //
        System.out.println(sum.calculate(1, 3));
    }
    }
