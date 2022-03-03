package com.capg.abstractexample;

public class Maintest 
{
	public static void main(String[] args) {
	     
	      Shape s1 = new Shape();
	      System.out.println(s1);  
	      Shape s2 = new Shape("green", false);
	      System.out.println(s2); 
	     
	      s1.setColor("blue");
	      s1.setFilled(true);
	      System.out.println(s1);  
	      System.out.println("Color is: " + s1.getColor());
	      System.out.println("Filled is: " + s1.isFilled());

	 
	  Circle c1 = new Circle();
	  System.out.println(c1);
	  Circle c2 = new Circle(1.1);
	  System.out.println(c2);
	  Circle c3 = new Circle(2.2, "green", false);
	  System.out.println(c3);
	 
	  c1.setColor("orange");  
	  c1.setFilled(true);     
	  c1.setRadius(8.8);
	  System.out.println(c1);
	  System.out.println("Color is: " + c1.getColor());  
	  System.out.println("Filled is: " + c1.isFilled()); 
	  System.out.println("Radius is: " + c1.getRadius());
	  System.out.printf("Area is: %.2f%n", c1.getArea());
	  System.out.printf("Perimeter is: %.2f%n", c1.getPerimeter());

	  Rectangle r1 = new Rectangle();
	  System.out.println(r1);
	  Rectangle r2 = new Rectangle(1.1, 2.2);
	  System.out.println(r2);
	  Rectangle r3 = new Rectangle(3.3, 4.4, "green", false);
	  System.out.println(r3);
	  
	  
	  r1.setWidth(5.5);
	  r1.setLength(6.6);
	  r1.setColor("orange"); 
	  r1.setFilled(true);    
	  System.out.println(r1);
	  System.out.println("Color is: " + r1.getColor());  
	  System.out.println("Filled is: " + r1.isFilled()); 
	  System.out.println("Length is: " + r1.getLength());
	  System.out.println("Width is: " + r1.getWidth());
	  System.out.printf("Area is: %.2f%n", r1.getArea());
	  System.out.printf("Perimeter is: %.2f%n", r1.getPerimeter());

	  
	  Square sq1 = new Square();
	  System.out.println(sq1);
	  Square sq2 = new Square(1.1);
	  System.out.println(sq2);
	  Square sq3 = new Square(2.2, "green", false);
	  System.out.println(sq3);
	  
	  sq1.setSide(3.3);
	  sq1.setColor("orange");  
	  sq1.setFilled(false);    
	  System.out.println(sq1);
	  System.out.println("Color is: " + sq1.getColor());   
	  System.out.println("Filled is: " + sq1.isFilled());  
	  System.out.println("Side is: " + sq1.getSide());

	  sq1.setWidth(4.4);  
	  System.out.println(sq1);
	  System.out.println("Width is: " + sq1.getWidth());   
	  sq1.setLength(5.5);  
	  System.out.println(sq1);
	  System.out.println("Length is: " + sq1.getLength()); 

	  System.out.printf("Area is: %.2f%n", sq1.getArea());
	  System.out.printf("Perimeter is: %.2f%n", sq1.getPerimeter());


	  }

}
