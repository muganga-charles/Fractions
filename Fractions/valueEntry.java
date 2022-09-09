import java.util.*;
public class valueEntry {
    public static void main(String[] args) {
        int  num, deno;

        Scanner input = new Scanner(System.in);

        System.out.print("enter the numearator: ");
        num = input.nextInt();

        System.out.print("enter the denominator: ");
        deno = input.nextInt();

        Fraction f1, f2;
        f1= new Fraction(num, deno);

        f2 = f1.simplify();

      //System.out.println( f1.toString());

      f1.simplify();
      System.out.println(f1.toString() + " can be reduced to " + f2.toString());
    }
    
}
