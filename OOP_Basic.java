//basic concepts of an Object Oriented Programming
package basic;

class Student{                //class is a blueprint of object
   
    String name;             //data member or instance variable or state
    int age;
   

    public void stdInfo(){                                //method or member function or behavior
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    
    Student(){                                              //non-parameterized constructor
        System.out.println("this is constructor");          //if we not create any constructor java consider a default constructor
    }

   
    Student(String name,int age){                          //parameterized constructor                        
       this.name = name;
       this.age = age;
    }

}
public class OOP_Basic {
    public static void main(String[] args) {
    	//new keyword is used to create an object not an constructor
    	//constructor is used to initialize an object or instance variable
        Student s1 = new Student("vivek",16);             //creating a object 
       
        s1.name="samarth";                              //initiating a value to a properties of object
        s1.age=19;
        s1.stdInfo();                                     //calling a method using object
    }
}


//object is a run time entity,instance of class,communicate each other using message,real world entity                                                      
