package HanckerRange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week1 {

    public static void main(String[] args) {


    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for(int i=0; i< arr.size() -1; i++) {
            int count = 1 ;
            for(int j=i+1; j< arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) count ++;
            }
            result.add(count);
        }
        return  result;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
       int sumLeft = 0;
       int sumRight =0;
       for(int i=0; i<arr.size(); i++) {
           for(int j=0; j<arr.get(i).size(); j++) {
               if(i==j) sumLeft += arr.get(i).get(i);
               if(j==arr.size()-i-1) {
                   System.out.println(j);
                   sumRight += arr.get(i).get(j);
               }
           }
       }

       return Math.abs(sumLeft - sumRight);


    }

    public static long flippingBits(long n) {
        // Write your code here
        List<Integer> list = new ArrayList<>();

        while(n!=0) {
            int c = (int) (n%2);
            list.add(c);
            n /= 2;
        }
        Collections.reverse(list);
        while(list.size() != 32) {
            list.add(0,0 );
        }

        int mu = 31;
        long result = 0;
        for (int x: list) {
            if(x == 0) result += Math.pow(2,mu);
            mu --;
        }
        return result;
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int sum = 0 ;
        List<Integer> mapArr = new ArrayList<>();
        for(int i=0; i<a.size(); i++) if(!mapArr.contains(a.get(i))) mapArr.add(a.get(i));
        int index  = 0;
        List<Integer> result  = new ArrayList<>();
        for(int i=0; i<mapArr.size(); i++) {
            int count = 0;
            while(a.contains(mapArr.get(i))) {
                count ++;
                a.remove(mapArr.get(i));
            }
            result.add(count);
        }
        int min = result.get(0);
        int t = 0;
        for(int i=0; i< result.size(); i++) {
            if(min > result.get(i)) t = i;
        }

        return  mapArr.get(t);

    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for (String x: queries) {
            int count = 0;
            for(String i: strings) {
                if(x.equals(i)) count++;
            }
            result.add(count);
        }
        return result;


    }
    public static String timeConversion(String s) {
        // Write your code here

        char check = s.charAt(8);
        String result = s.substring(0,8);
        int t = Integer.valueOf(result.substring(0,2));
        String h = "";
        if(check == 'A') {
            if(t == 12)  h = "00";
            else if(t >=10 && t<12 )  h = "" +t;
            else h = "0" +t;
        } else {
            if(t != 12) t +=12;
            h = String.valueOf(t);
        }
        return h + result.substring(2);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int length = arr.size();
        double db = (double) length;
        int d = 0, a=0, t=0;
        for (int x: arr) {
            if(x == 0) t++;
            else if (t<0) a++;
            else d ++;
        }
        System.out.println(d/db);
        System.out.println(a/db);
        System.out.println(t/db);
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        if(arr.isEmpty()) return;
        int length = arr.size();


        long total = 0 ;
        for (int x: arr ) {
            total += x;
        }
        Collections.sort(arr);
        long min = total - arr.get(length-1);
        long max = total - arr.get(0);
        System.out.println(min + " " + max);
    }
}
