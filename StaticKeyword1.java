package nonaccesmodifier;
class Mobile
{
	//instance variable
	String brand;
	int price;
	static String name;
	
	
	public Mobile() 
	{
	      
		brand = "";
		price = 45678;
		//name = "phone";
	}
	
	static 
	{
		System.out.println("inside static");
		name  = "phone";
	} 
	
	public void show() {
		System.out.println(brand+" "+price+" "+name);
	}
}
class StaticKeyword1 {

	public static void main(String[] args){
//		Mobile obj1 = new Mobile();
//		obj1.brand="Apple";
//		obj1.price=234234;
//		Mobile.name = "samartphone";
//
//		
//		Mobile obj2 = new Mobile();
//		obj2.brand="samsung";
//		obj2.price = 355433133;
//		obj1.show();
//		obj2.show();
		
	}

}
//if an instance variable have same value for all the object then we use static variable
//These variables are shared among all instances (objects) of the class, and they are associated with the class itself.

//as static variable shared among all objects so it is also access by class name
//saves memory

//every time an object created constructor called and 
//static variables is allocated that much times to object  which we don't want so we use static block here


//1. class loades  2. object initialised
//if we dont create object it will not load an class as well but if want to do it we use
     //Class.forname("class_name");