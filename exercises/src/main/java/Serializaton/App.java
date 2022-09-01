package Serializaton;

import java.io.*;
import java.util.Collections;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serialized.file"));
        MyObject object = new MyObject("name", Collections.singletonList("one"));
        objectOutputStream.writeObject(object);


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("serialized.file")));
        MyObject object1 = (MyObject) objectInputStream.readObject();

        System.out.println(object1);
    }
}
