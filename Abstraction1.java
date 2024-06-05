package interfaceInJava;
interface Animals{   //provide services requirement  //full implemented class
	
    void walk();   	//this method is public and abstract by default
     
     int a = 4;
    //only public, private, abstract, default, static and strictfp are permitted
    
//     static void run() {
//    	System.out.println("animal is running");
//    }
//    
//
//   //default methods introduces in java 8 : if child class overrides default method then overridden method will execute else the child class will inherit the method of parent class
//     
//    public default void sleep() {
//    	System.out.println("animal is sleeping");
//    }
    
}  

class Hors implements Animals{ //provide implementation of requirements
    public void walk(){
      System.out.println("horse on 4 legs");
    }
}

class Chicke implements Animals{ //should implement walk()
     public void walk(){
        System.out.println("chicken on 2 legs");
    }
}

public class Abstraction1 { //using interface
public static void main(String[] args) {
Hors h1 = new Hors();
h1.walk();

Chicke c1 = new Chicke();
c1.walk();
}
}
/*INTERFACE

 >all the data member are public,static and final by default
 >all method inside interface are abstract and public by default
 >A class that implements interface must implement all methods in interface by child class
 >it supports the multiple inheritance
 multiple inheritance :- two or more parent class inherits single child class   */                        




//In Java, a class cannot extend more than one class. Therefore following is illegal −

//Example :  public class extends Animal, Mammal{}

//However, a class can implement one or more interfaces, which has helped Java get rid of the impossibility of multiple inheritances.
//
//The reason behind this is to prevent ambiguity.
//
//Consider a case where class B extends class A and Class C and both class A and C have the same method display().
//
//Now java compiler cannot decide, which display method it should inherit. To prevent such situation, multiple inheritances is not allowed in java.