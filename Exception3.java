package exceptionhandaling;
public class Exception3 {
    public void check(int expiary){
        if(expiary<2020){
           if(expiary > 2022){
            throw new ArithmeticException("not valid in expiry year");
           }
        }
        else{
            System.out.println("valid expiry year");
        }
    }
    public static void main(String[] args) {
        Exception3 e1 = new Exception3();
        e1.check(41);
    }
}
