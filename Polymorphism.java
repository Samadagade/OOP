package polymorphism;
class Employee{
    int id;
    String name;
   public void employeeInfo(int id){
        System.out.println(this.id);
    }
   public void employeeInfo(String name){
        System.out.println(this.name);
    }
    public void employeeInfo(int id,String name){
        System.out.println(this.id+" "+this.name);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id=12;
        e1.name="amar";
        e1.employeeInfo(e1.id);
        e1.employeeInfo(e1.name);
        e1.employeeInfo(e1.id,e1.name);
    }
}

/*POLYMORPHISM 
poly : many
morpnhism : formsf

  there are two types of polymorphism
  runtime polymorphism      :- not in an java(operator overloading)
  compile time polymorphism :- methods with same name and different parameter or different return type
  */
   

