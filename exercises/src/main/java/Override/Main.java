package Override;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent("parent");
        Parent parent1 = new Child("child");
        System.out.println(parent.sayHello());
        System.out.println(parent1.sayHello());// // POLYMORPHISM.


    }
}
