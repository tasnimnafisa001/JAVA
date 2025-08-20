import java.lang.*;


public class Main 
{

  public static void main(String[] args) 
  {
    Shape s1=new Shape();
    s1.setX(20000);
    
    System.out.println("The X of Shape is : "+s1.getX());
    
    System.out.println("The Area of Shape is : "+s1.getArea());
  
  System.out.println("---------------");
  
  Shape s2=new Shape(30000);
  
    System.out.println("The X of Shape is : "+s2.getX());
    
    System.out.println("The Area of Shape is : "+s2.getArea());
  
  System.out.println("---------------");
    
    Rectangle r1=new Rectangle();
    
    r1.setX(12.5);
    r1.setY(11.7);
    
    System.out.println("The X of Rectangle is : "+r1.getX());
    
    System.out.println("The Y of Rectangle is : "+r1.getY());
    
    System.out.println("The Area of Rectangle is : "+r1.getArea());
  
  System.out.println("---------------");
  
  Rectangle r2=new Rectangle(17.5,14.7);
  
  
  System.out.println("The X of Rectangle is : "+r2.getX());
    
    System.out.println("The Y of Rectangle is : "+r2.getY());
    
  System.out.println("The Area of Rectangle is : "+r2.getArea());
  
  System.out.println("----------------");
  
  Square sq1=new Square();
  sq1.setX(15.9);
  
  
  System.out.println("The X of Square is : "+sq1.getX());
  
  System.out.println("The Area of Square is : "+sq1.getArea());
  System.out.println("----------------");
  
  Square sq2=new Square(10.2);
  
  System.out.println("The X of Square is : "+sq2.getX());
  
  System.out.println("The Area of Square is : "+sq2.getArea());
  System.out.println("----------------");
  
  Triangle t1=new Triangle();
  t1.setX(13.3);
  t1.setY(9);
  System.out.println("The X of Triangle  is : "+t1.getX());
  
  System.out.println("The Y of Triangle  is : "+t1.getY());
  
  System.out.println("The X of Triangle is : "+t1.getArea());
  System.out.println("----------------");
  
  Triangle t2=new Triangle(17.1,6);
  
  System.out.println("The X of Triangle  is : "+t2.getX());
  
  System.out.println("The Y of Triangle  is : "+t2.getY());
  
  System.out.println("The X of Triangle is : "+t2.getArea());
  System.out.println("----------------");
  
  Circle c1=new Circle();
  c1.setX(5);
  
  System.out.println("The X of Circle   is : "+c1.getX());
  
  System.out.println("The Area of Circle is : "+c1.getArea());
  System.out.println("----------------");
  
  Circle c2=new Circle(6);
  
  System.out.println("The X of Circle   is : "+c2.getX());
  
  System.out.println("The Area of Circle is : "+c2.getArea());
  System.out.println("----------------");
  
  }

}
