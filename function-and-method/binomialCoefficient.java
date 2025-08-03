import java.util.*;

public class binomialCoefficient {

     public static int factValue(int n){

        int factVal = 1;
        for (int i = 1; i <= n; i++) {
             factVal *= i ;
        }
        return factVal;
    }
    public static int binCoeffi(int n , int r){

        int fact_n = factValue(n);
        int fact_r = factValue(r);

        int fact_nmr = factValue(n-r);

        int binCoefficientVal = fact_n/(fact_r*fact_nmr);

        return binCoefficientVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n for binomial coefficient :");
        int n = sc.nextInt();

         System.out.println("enter the value of r for binomial coefficient :");
        int r = sc.nextInt();

        System.out.println("the binomial coefficient value is "+ binCoeffi(n, r));

               

    }
}

    
