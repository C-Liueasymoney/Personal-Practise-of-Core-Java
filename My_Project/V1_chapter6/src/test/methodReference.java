package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.Instant;
import javax.swing.Timer;

public class methodReference {
    public static void main(String[] args) {
        var listener = new RepeatedGreeter();
    }
}

class Greeter{
    public void greet(ActionEvent event){
        System.out.println("Hello the time is " + Instant.ofEpochMilli(event.getWhen()));
    }
}

class RepeatedGreeter extends Greeter{
    public void greet(ActionEvent event){
        var timer = new Timer(1000, super::greet);
        timer.start();
    }
}
