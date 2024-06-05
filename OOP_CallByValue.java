//call by value by removing static it is done by creating object
package basic;

public class OOP_CallByValue {
    static void increse(int a) {//called method
    	 a = a+10;
    }
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
	   int a = 40;
	   System.out.println("before change  "+a);//calling method
	   increse(a);
       System.out.println("after change   "+a);//calling method
       
	}

}

/*there are two types of call by in java
 * 1. call by value       : if we call method by passing an value call as call by value
 *                          the changes being done in called method not affected in calling method
 * 
 * 2. call by reference   : there is no call by reference in java
 *                          but it is achived by using objects 
 *                          
 * 
 */
