class Super_class {
   int num = 20;

     public void display() {
      System.out.println("This is the display method of superclass");
   }
}

public class Sub_class extends Super_class {
   int num = 10;


   public void display() {
      System.out.println("This is the display method of subclass");
   }

   public void my_method() {
     
      Sub_class sub = new Sub_class();

       sub.display();

      
      super.display();

      
      System.out.println("value of the variable named num in sub class:"+ sub.num);

     
      System.out.println("value of the variable named num in super class:"+ super.num);
   }

   public static void main(String args[]) {
      Sub_class obj = new Sub_class();
      obj.my_method();
   }
}

class Shapes {
  public void area() {
    System.out.println("The formula for area of ");
  }
}
class Triangle extends Shapes {
  public void area() {
    System.out.println("Triangle is ½ * base * height ");
  }
}
class Circle extends Shapes {
  public void area() {
    System.out.println("Circle is 3.14 * radius * radius ");
  }
}
class Main {
  public static void main(String[] args) {
    Shapes myShape = new Shapes();  
        Shapes myTriangle = new Triangle();  
            Shapes myCircle = new Circle();  
                myShape.area();
    myTriangle.area();
    myShape.area();
    myCircle.area();
  }
}