import java.util.*;
public class Addition {
    public static void main(String[] args) {
        Fraction f1,f2,f3,f4,f5;
        int numerator1,denominator1,numerator2,denominator2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numerator one : ");
        numerator1 = input.nextInt();//entry of the numerator of the first fraction
        System.out.print("Enter denominator one : ");
        denominator1 = input.nextInt();

        System.out.print("Enter numerator two : ");
        numerator2 = input.nextInt();
        System.out.print("Enter denominator two : ");
        denominator2 = input.nextInt();

        f1 = new Fraction(numerator1,denominator1);
        f2 = new Fraction(numerator2,denominator2);

        f3 = f1.add(f2);
        f4 = f3.simplify();
       // System.out.println("Sum of " + f1.toString() + " and " + f2.toString() + " is " + f3.toString() + "\n the simplified fracton is : " + f4.toString());

        f5 = Fraction.min(f1, f2);// minimum of the two 
        System.out.println(f5);
    }
    
}
