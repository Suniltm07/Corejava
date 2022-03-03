package com.capg.abstractexample;

public class Square extends Rectangle {
    public Square() {
        super();
    }

public Square(double side) {
    super(side, side);
}

public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);  
}

public double getSide() {
    return getSide();
}

public void setSide(double side) {
    this.setSide(side);
}

public void setWidth(double side) {
    this.setWidth(getWidth());
}

public void setLength(double side) {
    this.setLength(getLength());
}

public String toString() {
    return "Square[Rectangle" + "[" + "Shape" + "[" + "color=" + getColor() + "," + "filled=" + isFilled() + "]," + "width=" + getWidth() + "," + "length=" + getLength() + "]";
}
}
