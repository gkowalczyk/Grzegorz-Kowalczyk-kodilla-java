package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader1;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner1 {
    public static void main(String[] args) {
        FileReader1 fileReader1 = new FileReader1();

        try {
        fileReader1.readFile();
} catch (FileReaderException e ) {
            System.out.println("Problem while reading a file");
    }
}
}