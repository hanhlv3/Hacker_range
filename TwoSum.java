import java.util.ArrayList;

public class TwoSum {



    public static void main(String[] args) {
        System.out.println(isValid("(){]"));
    }


    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] rs = new int[2];
        for(int i=0; i< length - 1; i++) {
            for(int j=i+1; j< length; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target) {
                   rs[0] = i;
                   rs[1] = j;
                }
            }
        }
        return rs;
    }

    public static boolean  isValid(String s) {
        char[] chars = s.toCharArray();
        int length= chars.length;
        for(int i=0; i<length; i= i+2) {
            int j = i + 1;
            if(chars[i] == '(') {
                if(chars[j] != ')') return false;
            }
            if(chars[i] == '[') {
                if(chars[j] != ']') return  false;
            }
            if(chars[i] == '{') {
                if(chars[j] != '}') return false;
            }
        }

        return true;
    }

    public int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();

        for(char x: chars) {

        }
        return 1;

    }
}
