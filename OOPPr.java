//OOP basic concept clearance
package basic;

class Cycle{
    int price;
    String colour;
    public void showinfo(){
        System.out.println(this.colour);
        System.out.println(this.price);
    }
}
public class OOPPr {
    public static void main(String[] args) {
        Cycle c1 = new Cycle();
        c1.colour = "black";
        c1.price = 2342;
        c1.showinfo();
    }
}
