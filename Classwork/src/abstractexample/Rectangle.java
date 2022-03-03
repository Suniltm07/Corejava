package com.capg.abstractexample;

public class Rectangle extends Shape {

private double length;
private double width;

public Rectangle() {
    this.length = 1.0;
    this.width = 1.0;
}

public Rectangle(double length, double width)
{
    this.length = length;
    this.width = width;
}

public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
}

public double getWidth()
{
    return this.width;
}

public void setWidth(double width)
{
    this.width = width;
}

public double getLength()
{
    return this.length;
}

public void setLength(double length)
{
    this.length = length;
}

public double getArea() {
    return length * width;
}

public double getPerimeter() {
    return 2*length + 2*width;
}

public String toString() {
    return "Rectangle[Shape" + "[color=" + getColor() + "," + "filled=" + isFilled() + "]," + "width=" + width + "," + "length=" + length + "]";
}


}
