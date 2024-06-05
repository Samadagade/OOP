package nonaccesmodifier;

public class finalKeyword {


	//we can use final kwrd without initialization but only within the constructor need to initialize it
	 final int abc;            //instance final variable  : declared within class 
	                          //instance final variable must be initialized in an constructor else show   error:variable abc not initialized in the default constructor

     public finalKeyword() {  //constructor to initialize local final variable
		this.abc = 34;
	}

	final double pi = 3.14;     //direct initialization of instance final variable
	//static final variables
	static final int max;
	static{
           max = 100;
	    }


	final void display() {
		System.out.println(pi);
		final int dsfg;             //blank final variable
		dsfg = 55;                  //local final variable initialized
	} 

    void displaySquare(final int a) {    //a is instance final veriable  : final veriable declared within method
    	//a = 45;    //error : cannot change the value of final if it is pass as method parameter 
    }
    
   

	public static void main(String[] args) {
			finalKeyword obj1 = new finalKeyword();
			obj1.display();
		    obj1.displaySquare(34);
	}

}
//final keyword
//final kwrd used with variable method and class

//if we make any *variable* final we cannot change its value              variable can be of 2 types : local, instance or class variable
//if we make any *method* final we cannot override it
//cannot extends final *class* in java                                    //no child classes of parent class has been created
//constructor is never final because it never inherited



/*  * final keyword *
 * cannot change the value of final if it is pass as method parameter
 * 
 * 
 */
//the final variable which is declared but not initialized called as : blank final variable
//3 ways to initialize final kwrd
//direct initialization    :   final int pi = 3.14;
//static block            :   static{final int a = 120};
//using constructor       :	
