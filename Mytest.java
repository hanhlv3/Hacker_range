import java.util.ArrayList;
import java.util.Scanner;

public class Mytest {

    public static void main(String[] args) {
        String[] words = {"cool", "lock", "cook"};
        System.out.println(listChars(words));
    }
    public static int maxRepetion(String s) {
        if(s.isEmpty()) return 0;
        int length=0;
        for(int i=0; i< s.length(); i++) {
            ArrayList<Character> list = new ArrayList<>();
            list.add(s.charAt(i));
            for(int j=i+1; j<s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    list.add(s.charAt(j));
                } else {
                    break;
                }
            }
            if(list.size() > length ) length = list.size();
        }

        return length;
    }

    public static ArrayList<Character> listChars(String[] arr) {
        ArrayList<Character> chars = new ArrayList<>();

        char[] firstLine = arr[0].toCharArray();
        for(char x: firstLine) {
            boolean check = true;
            for(int i=1; i< arr.length; i++) {
                int index = arr[i].indexOf(x);
                if(index == -1) {
                    check = false;
                    break;
                } else {
                    arr[i] = arr[i].replaceFirst(String.valueOf(x), " ");
                }

            }
            if(check) chars.add(x);
        }
        return chars;
    }
}
