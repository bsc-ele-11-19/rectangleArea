import java.beans.beancontext.BeanContext;
import java.util.*;
public class RectangleArea{
     public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          System.out.println("'the area will be shown here'");
          Area a = new Area();
          System.out.println("Enter length of the rectangle");
          double lenght = in.nextDouble();
          System.out.println("Enter breadth of the rectangle");
          double breadth = in.nextDouble();
          System.out.println("The area of the rectangle is " + a.returnArea(lenght , breadth ) );

     }
}
// creating a new class or the rectangle
class Area{
     // creating rectangle dimensions 
     double lenght;
     double breadth;
     Area(){
          lenght  = 1;
          breadth = 1;
     }
     // method 
     double returnArea( double lenght , double breadth){
          double result = lenght * breadth;
                 return result;
     }
}