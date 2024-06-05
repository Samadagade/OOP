package nonaccesmodifier;

public class thisKeyword {
	int price;
	int nwprice;
	
	thisKeyword(int price, int nwprice){
		this.price = price;       //to refer current class instance variable
		this.nwprice = nwprice;
		
	}
	
	
		public thisKeyword() {
			this(78,75); //to invoke current class constructor
			this.display();//to invoke current class methods
		}
	
    
	
	//this can be used to return the current class instance veriables from the method.
	thisKeyword get() {
		System.out.println("this can be used to return the current class instance from the method.");
		return this;
	}

	
	//to display values of instance variable
	void display()	{
		System.out.println(price+" "+nwprice);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        thisKeyword obj1 = new thisKeyword(68,684);
        thisKeyword obj2 = new thisKeyword();
        obj1.display();
        obj2.display();
        obj1.get().display();;
	}

}
//Here is given the 6 usage of java this keyword.
//
//this can be used to refer current class instance variable.
//this can be used to invoke current class method (implicitly)
//this() can be used to invoke current class constructor.
//--> this can be passed as an argument in the method call.
//--> this can be passed as argument in the constructor call.
//this can be used to return the current class instance veriables from the method.