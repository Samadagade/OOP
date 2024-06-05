package exceptionhandaling;


public class Exception2 {
    public void checkage(int age){
        if(age<18){
            throw new ArithmeticException("not give wote");
        }
        else{
            System.out.println("congratulations you will give a wote");
        }
    }
    public static void main(String[] args) {
        Exception2  e1= new Exception2();
        e1.checkage(4);

    }

}
