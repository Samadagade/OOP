package abstraction;

abstract class Animal{              //we give the abstract kwrd only for those which is only in concept example animal is a concept but horse is present in real
abstract public void walk();//abstract method


public void eat(){  //non abstract method
    System.out.println("Animal is eating");
}
}

class Horse extends Animal{       
    Horse(){//we use constructor in abstraction
        System.out.println("crated a horse");
    }
    public void walk(){
        System.out.println("horse is walking on 4 legs");
    }
}

class Chicken extends Animal{
	 public void walk(){
	        System.out.println("chicken is waking on two legs");
	    }
}

public class Abstraction {                                           //using abstract kwrd
    public static void main(String[] args) {
    Horse h1 = new Horse();
    h1.walk();
    h1.eat();
    Chicken c1 = new Chicken();
    c1.walk();
    }
}
/*ABSTRACTION
  hiding irrelevent information from user
  
  there are two types of abstraction
  > using abstract kwrd     (partial abstraction)
  > using interfaces  (full abstraction)


  properties for abstraction :
  >Abstract class must be declare by abstract kwrd
  >it contain abstract as well as non-abstract method
  >cannot create a object of abstract class
*/