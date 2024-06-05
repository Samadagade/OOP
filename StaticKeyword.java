package nonaccesmodifier;
class Pen{
    static String colour = "red";  //if we define a property of any object as an static then it is applicable for all object of that class
    int price;

    public Pen(int price){
    this.price = price;
    }
    void display() {
    	 System.out.println("price is "+price+"  Colour is "+colour);
    } 
    public static void main(String[] args) {
        Pen p2 = new Pen(20);
        p2.display();
    }            
}
/* static can be a class variable, class method, block, nested class 
 * 
 *1. static variable
 *   if we declare variable as an static then it is accessible to every object
 * */
