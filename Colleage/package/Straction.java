public class Straction {
    public static void main(String[] args) {
        Triangle t = new Triangle(12.0,10.3,12.5,23.4,23.9);
        t.calculateArea();
        t.calculatePerimeter();
        t.display();

        Square s = new Square(23);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();


        Circle c = new Circle(5.6);
        c.calculateArea();
        c.calculatePerimeter();
        c.display();
        
    }
    
}

abstract class Shape{
    double side;
    double area;
    double perimeter;

    abstract public double calculateArea();
    abstract public double calculatePerimeter();

    public  void display(){
        System.out.println("Area is:" + this.calculateArea());
        System.out.println("perimeter is :"+this.calculatePerimeter());
    }

}


class Triangle extends Shape{
    double a;
    double b; 
    double c;
    double length;
    double breadth;

    Triangle(double a, double b,double c, double l,double br){
        this.a = a;
        this.b =b;
        this.c = c;
        this.length = l;
        this.breadth = br;
    }

    public double calculateArea(){
        this.area = 0.5*this.length * this.breadth;
        return area;
    }
    public double calculatePerimeter(){
       this.perimeter = a+b+c;
       return perimeter;
    }
}

class Square extends Shape{
    double side;
    Square(double side){
        this.side = side;
    }
    public double calculateArea(){
        this.area = side*side;
        return area;
    }
    public double calculatePerimeter(){
        this.perimeter = 4*side;
        return perimeter;

    }
}

class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;

    }

    public double calculateArea(){
        this.area = 3.142*(r*r);
        return area;
    }

    public double calculatePerimeter(){
        this.perimeter = 2*(3.142)*r;
        return perimeter;
    }
}