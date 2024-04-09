import java.util.Scanner;

// Question => Given an integer A, you have to tell whether it is a prime number or not
public class App {

      public static void Prime_number(int n ){
            int countDivisors =0;
            for (int i = 1; i*i <=n; i++) {
                if (n%i==0) {
                    if (i*i==n) {
                        countDivisors++;  
                    }
                    else{
                        countDivisors= countDivisors+2;
                    }

                    
                }
            }
            if (countDivisors==2) {
              System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Find Prime or not ?");
        int n = sc.nextInt();
        sc.close();
        Prime_number(n);
    }
}