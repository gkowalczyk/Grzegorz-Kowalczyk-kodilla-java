package ProxyPattern;

public interface Subject {
    void foo();
}

class ProxySubject implements Subject {

     RealSubject realSubject;

    public RealSubject getRealSubject() {
        return realSubject;
    }

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }


    public void foo() {
        System.out.println("first");
        if (realSubject == null) {
            realSubject = new RealSubject();
            realSubject.foo();
            System.out.println("final");
        }
    }
}

class RealSubject implements Subject{


    public void foo() {
        System.out.println("I'm Real Subject");
    }


    public static void main(String[] args) {
       Subject subject = new ProxySubject();
       subject.foo();
    }
}