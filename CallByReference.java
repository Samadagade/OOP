//call by reference achieved by creating and passing an object
package basic;


public class CallByReference {
	int a;
    void change(CallByReference obj) {
    	 obj.a = obj.a+200;
    }
    public static void main(String[] args) {
    	
    	CallByReference obj = new CallByReference();
    	obj.a = 45;
        System.out.println("before calling  "+obj.a);
    	obj.change(obj);
    	System.out.println("after calling   "+obj.a);
	}
}
