package Override;

public class Child extends Parent {


    public Child(String name) {
        super(name);
//super.sayHello();
    }

    @Override
    public String sayHello() {//Dzięki wykorzystaniu adnotacji @Override kompilator otrzymuje od nas informację, że dana metoda będzie przysłaniać inną metodę. W przypadku, gdy żadna metoda do przysłonięcia nie zostanie odnaleziona (np. w interfejsie, w klasie rodzica) to kompilator zwróci nam błąd.
        return "Hello, I am from Child.class" + name;


    }
}

