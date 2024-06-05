package exceptionhandaling;
public class Exception1 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
       try{ //risky code
         int a = 31/0;
       }
//       catch(ArithmeticException e){
//           System.out.println("Arithmatic Exception occur");
//       }
//       
       catch(Exception e){  //handaling code
        System.out.println("division is not possible  "+e);
    }

         finally{   //executes wheter an exception is handle or not
        System.out.println("this is the program");
    }
    }
}





/*ERROR : illegal operation perform by the user which result abnormal working of program
this is occur due to lack of system
not recoverable


there are three types of errors
>compile time : error occur during compilation of program    eg. syntax error
>run time     : error occur after run the program            eg. / by zero
>logical error: if the logic of the program is wrong

EXCEPTION it is the event that distub the normal flow of program
this is occur due to programmer
recoverable
*/



/*class River{
    //int capacity         gives syntax error i.e. compile time error
    int a;
    int capacity = a+b;   //gives error because b is not define this is compile time error
}*/

/*EXCEPTION it is the event that distub the normal flow of program
this is occur due to programmer
recoverable


throw :
exception is already know to programmer and he will throw it
throw keyword used to throw the excetion by the programer
*/