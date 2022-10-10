package FunctionalInterfaceExample;
//http://devfoundry.pl/wyrazenia-lambda-i-interfejsy-funkcyjne/
public class MainNothingExecute {
    public static void main(String[] args) {

        NothingSpecial nothingSpecial = MainNothingExecute::printMessage;
        // alternatywny zapis   NothingSpecial nothingSpecial = () -> printMessage();
       nothingSpecial.nothing();

    }

    private static void printMessage() {
        System.out.println("Text from printMessage method");
    }


}
