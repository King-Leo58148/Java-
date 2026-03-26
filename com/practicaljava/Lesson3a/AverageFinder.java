package com.practicaljava.Lesson3a;

public class AverageFinder {
    public static void main(String[] args) {
        
    double [] a;
    double b;

    NumberInput nIn = new NumberInput();
    Average av = new Average();
    MessageDisplay display = new MessageDisplay();
    
    a = nIn.getNumber();
    b=aV.aveCalc(a);
    display.displayMessage(b);

    }
    
}
