package HanckerRange;

import java.util.*;


public class LeetCode {

    public static void main(String[] args) {

        encrypt("helload");


    }

    public boolean isPalindrome(int x) {
        // trái qua phải bằng phải qua trái
        boolean rs = true;
        String x1 = String.valueOf(x);
        String newString = "";
        for (int i= x1.length(); i >=0; i--) {
            newString += String.valueOf(x).charAt(i);
        }
        return x1.equals(newString);
    }

    public static String stack(String s) {
        Stack<Character> st = new Stack<>();

        String rs = "";

        for (int i=0; i< s.length(); i++) {
            if (st.isEmpty() || st.peek() == s.charAt(i)) {
                st.push(s.charAt(i));
            } else {
                rs += st.peek() + String.valueOf(st.size());
                st.clear();
                st.push(s.charAt(i));
            }

             if (i == s.length() -1 ) {
                 if (st.isEmpty()) rs += s.charAt(i) + "1";
                 else rs += s.charAt(i) + String.valueOf(st.size());
             }
        }
        System.out.print(rs);
        return rs;
    }

    public static void queue(String s) {
        Queue<Integer> queue = new ArrayDeque<>();

        int k = 1;
        for (int i = 0; i < k; i++) {
            int a = queue.poll();
            queue.add(a);
        }

        for (Integer item: queue) {
            System.out.print(item + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i=2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) return false;
        }
        return true;
    }

    public static void superPrime(int n) {
        if (n >= 2) {
            for (int i = 2; i < n; i++) {
                if (isPrime(i)) {
                    String str = String.valueOf(i);
                    int l = str.length();
                    Queue<Integer> queue = new ArrayDeque<>();
                    while (l != 0) {
                        queue.add(Integer.valueOf(str.substring(0, l)));

                        l --;
                    }
                    boolean check = true;
                    for (Integer item: queue) {
                        if (!isPrime(item)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) System.out.print(i + " ");
                }
            }
        }
    }

    public static void linkedList() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }
        int k = scanner.nextInt();
        int value = list.get(k);


        for (int i = 0; i < list.size(); i++) {

        }

        int i = 0;
        while (i < list.size()) {
            if (value < list.get(i)) list.remove(i);
            else i ++;
        }

    }

    public void findNumber() {
        List<Integer> result = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        

    }

    int maxSub(int[][] inMatrix, int k) {
        int n = inMatrix.length;
        int m = inMatrix[0].length;

        // first result
        int sum = 0;
        for (int i=0; i < k; i++) {
            for(int j=0; j < k; j++) {
                sum += inMatrix[i][j];
            }
        }
        for (int i = 0;  i < n; i++) {

        }
        return 0;
    }

    public static String encrypt(String str) {
        String s = str.replaceAll(" ", "");
        double l = Math.sqrt(s.length());
        int max = (int) Math.ceil(l);

        int min = max -1;
        String c[][] = new String[min][max];

        boolean flag = false;
        // chia ra con

        int k = 0;
        String rs = "";

        for (int i=0; i < max; i++) {
            for(int j=0; j< min; j++) {
                if (k > s.length()) {
                    c[i][j] = "";
                } else {
                    c[i][j] = s.charAt(k) + "";
                }
                k++;
            }
        }
        for (int i=0; i < max; i++) {
            String row = "";
            for(int j=0; j< min; j++) {
                row += c[i][j];

            }
            rs = rs + " " + row;
        }
        return rs.trim();


    }

    String flowersForWife(String garden, int n) {
        int size = garden.length();
        boolean check = false;
        for(int i=0; i < size; i++) {
            int j = 1;
            boolean flag = false;
            int k = i;
            while (j <= n) {
                if (garden.charAt(k) == '0') {
                    flag = true;
                    k++;

                } else {
                    flag = false;
                    break;
                }
                j ++;
            }

            if (flag) {
                if (garden.charAt(i+n) == '0') {
                    if (i!=0) {
                        if (garden.charAt(i-1) == '0') return "trong duoc";
                    } else return "trong duoc";
                }
            }
        }
        return "khong trong duoc";
    }

    String matrixHadRules(int N, int[][] matrix) {


        return "hello";
    }

}
