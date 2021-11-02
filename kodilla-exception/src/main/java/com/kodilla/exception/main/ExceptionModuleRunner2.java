package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader1;
import com.kodilla.exception.io.FileReader2;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner2 {
    public static void main(String[] args) {
        FileReader2 fileReader2 = new FileReader2();

        try {
            fileReader2.readFile("names.txt");
        } catch (FileReaderException e ) {
            System.out.println("Problem while reading a file");
        }
    }
}