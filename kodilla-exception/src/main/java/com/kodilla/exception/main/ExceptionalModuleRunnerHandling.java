package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionalModuleRunnerHandling {
    public static void main(String[] args) throws FileReaderException {
        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        fileReaderWithoutHandling.readFile();
    }
}