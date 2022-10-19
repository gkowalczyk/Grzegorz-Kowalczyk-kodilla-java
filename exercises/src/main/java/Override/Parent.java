package Override;

public class Parent {

    String name;

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                '}';
    }
    public Parent(String name) {
        this.name = name;
    }


    public String sayHello (){
            return "Hello, I am from Parent.class" + name;
        }

    }
