package basic;
public class Ternaryoperator {
    public static void main(String[] args) {
        int a = 563;
        int b = 522;
       int price = a<b?a-b:a*b;   
       System.out.println(price);
    }
}
/*ternary operator
it is the replacement of if else statements
int price = a<b?a-b:a*b;
working as follow
if a<b execute a-b else a*b;
*/