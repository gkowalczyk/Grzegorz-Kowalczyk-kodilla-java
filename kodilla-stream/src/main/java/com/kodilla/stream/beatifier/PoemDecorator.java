package com.kodilla.stream.beatifier;

interface PoemDecorator {

     String decorate(String text);


}
class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator) {
    String result = poemDecorator.decorate(text);
    System.out.println("Result :" +  result);
    }

}


