package constructor;
class Student{                //The purpose of constructor is to initialize the object of a class 
                             //Constructors cannot be abstract, final, static
    String name;
   
    int age;
   
   
    public void stdInfo(){                                //method
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    
    Student(){                                              //non-paramiterised constructor
        System.out.println("this is constructor");          //if we not create any constructor java consider a default constructor
    }
    
    Student(String name,int age){                          //Parameterized constructor                        
       this.name = name;                                   
       this.age = age;
       
    }

}
public class OOP_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("vivek",16);                 //creating a object
     //   Student s2 = new Student("vivek",16);
        // s1.name="samarth";                                   //initiating a value to a properties of object
       //s1.age=19;                                           
        s1.stdInfo();                                   //calling a method
    }
}
/*properties of constructor
constructor are used to initialize a object
provide instance variable as a parameter to the constructor to initialize
name of constructor same as class name
 only public protected private and default modifiers are allowed for constructor
constructor has not any return type
constructor has not ant data type
we call only one time when object is created
if there are n objects then constructor execute n times


there are three type of constructors
Parameterize constructor
Non-Parameterized constructor
default constructor
*/

//dynamic initialization : provide a value to data member of at a runtime
//static initialization : provide a value to data member of at a compile using parameterized constructor

