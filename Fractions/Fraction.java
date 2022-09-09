/**
 * Fraction
 */
public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int num, int deno){
        //setNumerator(num);
        //setDenominator(deno);
        //mordified costructor for negative entries
        if (deno < 0) {
            num = -num;
            deno = -deno;
            }
            if (num == 0) {
            deno = 1;
            }
            setNumerator(num);
            setDenominator(deno);
    }

    public int getNumerator() {
        return numerator;    
    }

    public int getDenominator() {
        return denominator;    
    }

    public void setNumerator(int num) {
        numerator = num;
        
    }
    public void setDenominator(int deno) {
        if (deno == 0){
            System.err.println("Fatal error");
            System.exit(1);
        }
        denominator = deno;
        
    }
    public int gcds(int m,int n) {
        int r;
        do {
          r = n % m;
          n = m;
          m = r;
        }while (r != 0);
          return n;
      }
    public String toString(){
        return getNumerator() + "/" + getDenominator();
        }
    // public void simplify(){
    //     int num = getNumerator();
    //     int denom = getDenominator();
    //     int gcd = gcds(num, denom);
    //     setNumerator(num/gcd);
    //     setDenominator(denom/gcd);
    //     }
    public Fraction simplify(){
        int num = getNumerator();
        int denom = getDenominator();
        int gcd = gcds(num, denom);
        Fraction simp = new Fraction(num/gcd, denom/gcd);
        return simp;
        }
    
    public Fraction add( Fraction frac) {
        int a, b, c, d;
        Fraction sum;
        a = this.getNumerator(); //get the receiving
        b = this.getDenominator(); //object's num and denom
        c = frac.getNumerator(); //get frac's num
        d = frac.getDenominator(); //and denom
        sum = new Fraction(a*d + b*c, b*d);
        return sum;
        }

    public static Fraction min(Fraction f1, Fraction f2) {
        //convert to decimals and then compare
        double f1_dec = f1.decimal();
        double f2_dec = f2.decimal();
        if ( f1_dec <= f2_dec) {
        return f1;
        } else {
        return f2;
        }
        }
        private double decimal(){
        //returns the decimal equivalent
        return (double) getNumerator() / getDenominator();
        }
}