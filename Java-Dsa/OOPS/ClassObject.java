public class ClassObject {
    public static void main(String args[]){
       student s1 = new student();
       System.out.println(s1.name);
       s1.percentage(200,199,223);

         
         

    }

} 

class pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color = newcolor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class student{
    String name = "siddu nhavi";
    int age = 19;
    

    void percentage(int a,int b,int c){
        float cgpa = (a+b+c)/3;
        System.out.println(cgpa);
    }

}