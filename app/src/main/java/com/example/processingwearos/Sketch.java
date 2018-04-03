package com.example.processingwearos;

import processing.core.PApplet;
import processing.core.PFont;

public class Sketch extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        PFont font = createFont("SandSerif", 20 * displayDensity);
        textFont(font);
        textAlign(CENTER, CENTER);
    }

    public void draw() {
        background(0);
        text("Hello world!", width / 2, height / 2);
    }
}
