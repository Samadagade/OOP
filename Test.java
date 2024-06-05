package constructor;

public class Test {
     Test(){
    	System.out.println("Constructor");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Test t1 = new Test();
         Test t2 = new Test();
         Test t3 = new Test();
	}

}
//if there are n objects then constructor execute n times
