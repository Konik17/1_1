
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
    // Create instances of different shapes
    Circle circle = new Circle(5.0);
    Rectangle rectangle = new Rectangle(4.0, 6.0);
    
    // Calculate and display areas
    System.out.println("Circle area: " + circle.calculateArea());
    System.out.println("Rectangle area: " + rectangle.calculateArea());
    
    // Demonstrate polymorphism
    Shape[] shapes = {circle, rectangle};
    for (Shape shape : shapes) {
      System.out.println("Shape type: " + shape.getClass().getSimpleName());
      System.out.println("Shape area: " + shape.calculateArea());
    }
  }
}

// Abstract class for shapes
abstract class Shape {
  public abstract double calculateArea();
}

// Circle implementation
class Circle extends Shape {
  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }
  
  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

// Rectangle implementation
class Rectangle extends Shape {
  private double width;
  private double height;
  
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  @Override
  public double calculateArea() {
    return width * height;
  }
}
