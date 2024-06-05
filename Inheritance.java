package inheritance;
class shape{                                        //parent class,base class                 
    public void area(){
        System.out.println("area of shape");
    }
}
 
class triangle extends shape {                      //child class,sub class
    public void area(int l, int h) {
        int area = (int) (0.5 * l * h);
        System.out.println(area);
    }    //single level inheritance

    class eqtriangle extends triangle { //child class of child class

        public void area(int l, int h) {
            int area = (int) 0.5 * l * h;
            System.out.println(area);
        }
    }
}
public class Inheritance {                                                                   
    public static void main(String[] args) {
        triangle t1 = new triangle();             //object of child class access the properties of parent class
        t1.area(12,12);                        
    }
}

    
/*INHERITANCE :- child class access all the properties of the  parent class
                 it is represent is-A also called parent-child relationship
                 
used for achieving : 1.  code reusability  2. method overriding(parent and child have method with same name and same parameter)
there are four types of inheritance in java and five in c++
  single level inheritance : only one class inherit another class
  multilevel inheritance : parent class inherited by child class again child class inherited by its child class and so on
  Hierarchical inheritance : single parent class inherited by multiple child classes
  hybrid inheritance : combination of single level,multilevel,hierarchical inheritance
  multiple inheritance and hybrid inheritance: not in java why??           present in c++
  suppose there are two methods with same name are in both parent classes there is confusion of child class is to which parent method is call 
*/
