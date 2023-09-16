import java.util.ArrayList;
import java.util.Scanner;

public class Nummeric {

    public static void main(String[] args) {
       System.out.println(factorSum(8));
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1; i<n; i++) {
            if(arr[i] >max) max = arr[i];
        }
        System.out.print(max);


    }



    public static boolean isPrime(int n) {
        if(n<= 1) return false;
        for(int i=2; i<= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static  int factorSum(int n) {
        if(!isPrime(n)) {
            ArrayList<Integer> listPrimes = new ArrayList<>();
            while(n!=1) {
                for(int i=2; i<=n; i++) {
                    if(isPrime(i) && n%i==0) {
                        listPrimes.add(i);
                        n = n/i;
                        break;
                    }
                }
            }
            int sum = 0;
            for (int x: listPrimes) {
                sum += x;
            }
            return factorSum(sum);
        }
        return n;
    }

    public static int greatestCommonPrimeDivisor(int a, int b) {


        int min = (a<b)?a :b;
        int result = -1;
        for(int i=2; i<=a; i++) {
            if(isPrime(i) && a%i==0 && b%i==0) result = i;
        }
        return result;


    }

}
