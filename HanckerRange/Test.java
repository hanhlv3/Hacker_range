package HanckerRange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String s = "12:45:54PM";
        timeConversion(s);

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
