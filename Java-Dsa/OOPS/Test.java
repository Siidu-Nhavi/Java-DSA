public class Test{
    public static void main(String args[]){
        
        Rectangle r1 = new Rectangle(10, 5);
        System.out.print("------------------For Rectangle --------------\n");
        r1.calculateArea();
        r1.calculatePerimeter();
        r1.display();

        System.out.print("---------For circle----------- \n");
        Circle c1 = new Circle(3.14, 8);
        c1.calculateArea();
        c1.calculatePerimeter();
        c1.display();

        System.out.print("---------For Triangle----------- \n");
        Triangle t1 = new Triangle(12, 13, 10);
        t1.calculateArea();
        t1.calculatePerimeter();
        t1.display();

    }
}

abstract class A{
    //instance variables
    int side;
    float area;
    float perimeter;

    // abstact methods
    abstract void calculateArea();
    abstract void calculatePerimeter();

    //concreate methods
    void display(){
        System.out.println("Area is:"+this.area);
        System.out.println("Perimeter is:"+this.perimeter);
    }
}

class Rectangle extends A{
    int length;
    int width;

    public Rectangle(int l,int w){
        this.length=l;
        this.width=w;
    }
    void calculateArea(){
       this.area = length*width;
    }

    void calculatePerimeter(){
        this.perimeter = 2*(length+width);
    }
}

class Circle extends A{
    double pie;
    int radius;

    public Circle(double pie,int radius ){
        this.pie = pie;
        this.radius = radius;
    }

    void calculateArea(){
        this.area = (float) (pie*radius*radius);
    }

    void calculatePerimeter(){
        this.perimeter = (float)(0.5*(pie*radius*radius));
    }
}

class Triangle extends A{
    int side1;
    int side2;
    int side3;
    
    public Triangle(int s1,int s2,int s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    void calculateArea(){
        this.area = (float)0.5*(side3*side1);
    }

    void calculatePerimeter(){
        this.perimeter = (int)(side1+side2+side3);
    }
}