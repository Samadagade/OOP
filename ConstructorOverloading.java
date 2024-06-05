package polymorphism;
    class student1 {  //overloading : constructor with same name but differant paramerter
    String collage;
    student1(double marks){
    System.out.println("this is double constructor");
    }
    
     student1(int rollno){
        System.out.println("this is int constructor");
    }
     
    student1(){
        System.out.println("no parameter constructor");
    }
}
public class ConstructorOverloading{
    public static void main(String[] args) {
    student1 s1 = new student1(788854154);//call constructor depend on parameter
    s1.collage = "VJTI";
    }
}
