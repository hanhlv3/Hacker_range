import java.util.ArrayList;
import java.util.Scanner;

public class MyString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "LeVanHanh";
        System.out.println(amendTheSentence(s));


        /*
        * replace
        * charAt
        * */

    }

    public static  void xau(String s) {
        for(char c='0'; c<='9'; c++) {
            s = s.replace(c + "", "");
        }
        System.out.print(s);
    }

    public void toUperCase(String s ) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

            }
        }
    }

    public void revertString(String s) {

        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer.reverse().toString());

    }

    public static String amendTheSentence(String s) {

        String result = "";
        for(char x: s.toCharArray()) {
            if(x >='A' && x<='Z') {
                result += " " + x;
            } else {
                result += x;
            }
        }

        result = result.toLowerCase().trim();
        return result;


    }

    String formatString(String input) {
        input = input.trim();
        String result = "";
        int length = input.length();
        for(int i=0; i<= length-2; i++) {
            if(input.charAt(i) == ' ' && input.charAt(i+1) == ' ') {
                continue;
            } else {
                if(i== length-2) {
                    result += input.charAt(length-1);
                }
                if(input.charAt(i) == ' ' && input.charAt(i+1) != ' ') {
                    result += " ";
                } else {
                    result += input.charAt(i);
                }
            }
        }
        return result;

    }





}
