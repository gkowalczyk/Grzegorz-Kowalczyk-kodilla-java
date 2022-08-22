public class StaticBinding {

    public static class superclass {
        static void print() {
            // Print statement
            System.out.println(
                    "print() in superclass is called");
        }
    }

    public static class subclass extends superclass {
        static void print() {

            // print statement
            System.out.println("print() in subclass is called");
        }
    }


    public static void main(String[] args) {
superclass a = new superclass();
superclass b = new subclass();

a.print();
b.print();
    }
    }


//Output Explanation: As you can see, in both cases the
// print method of the superclass is called. Let us discuss how this happens
//
//We have created one object of subclass and one object
// of the superclass with the reference of the superclass.
//Since the print method of the superclass is static, the compiler
// knows that it will not be overridden in subclasses and hence
// compiler knows during compile time which print method to call
// and hence no ambiguity.