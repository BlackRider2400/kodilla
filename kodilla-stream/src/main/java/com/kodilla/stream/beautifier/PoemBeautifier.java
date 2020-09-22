package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        String result = poemDecorator.process(text);
        System.out.println(result);
    }
}
