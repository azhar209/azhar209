
import java.util.*;
 class caluculator{
    public static void main (String [] args){
      Scanner s = new Scanner(System.in);
     //s.close();
      System.out.println("Enter the value of A : ");
      int a = s.nextInt();
      System.out.println("Enter the value of B : ");
      int b = s.nextInt();
      System.out.println("Press ");
      System.out.println("1 . Addition ");
      System.out.println("2 . Subtraction ");
      System.out.println("3 . Multiplication");
      System.out.println("4 . Division");
      System.out.println("                               ");
      int button = s.nextInt();
      System.out.println("                               ");
      switch(button){
        case 1 : System.out.println(a+b);
        break;
        case 2 : System.out.println(a - b );
        break;
        case 3 : System.out.println(a * b);
        break;
        case 4 : System.out.println(a / b);
        break;
        default: System.out.println("Invalid ");
      }
    }
}