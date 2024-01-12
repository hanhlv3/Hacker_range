package HanckerRange;

import java.util.ArrayList;
import java.util.Scanner;

public class Topic2 {


    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Topic2 topic2 = new Topic2();
        topic2.bai8();
    }


    public void bai1() {
        /*
        Bài 1: Viết hàm tìm giá trị X (X nhập vào từ bàn phím) trong mảng số nguyên A (đã
        được nhập vào từ bài 1 topic 1) và cho biết giá trị X có tồn tại trong mảng A hay không.
         */


        int x = scanner.nextInt();

        int a[] = Topic1.inputArray();
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                check = true;
                break;
            }
        }

        if (check) System.out.println(x + " có trong mảng");
        else System.out.println(x + " không có trong mảng");
    }

    public int bai2() {
        /**
         * Bài 2: Viết hàm đếm số lần xuất hiện của số nguyên X (X nhập vào từ bàn phím) trong
         * mảng số nguyên A (đã được nhập vào từ bài 1 topic 1). Nếu không có thì hiển thị -1.
         * */
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int a[] = Topic1.inputArray();

        int count = 0;
        for (int i: a) {
            if (i == x) count ++;
        }

        if (count == 0) {
            System.out.println(-1);
            return -1;
        }

        System.out.println(count);
        return count;

    }

    public void bai3() {
        /*
        Bài 3: Viết hàm hiển thị các vị trí chứa giá trị số nguyên X (X nhập vào từ bàn phím)
    trong mảng số nguyên A (đã được nhập vào từ bài 1 topic 1). Nếu không có thì hiển thị -1.
         */

        int x = scanner.nextInt();
        int a[] = Topic1.inputArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) System.out.print(i + " ");
        }

    }

    public void bai4() {
        /*
        Bài 4: Viết hàm đếm xem có bao nhiêu phần tử có giá trị nằm trong khoảng [X,Y] (X và
        Y nhập vào từ bàn phím) trong mảng số nguyên A (đã được nhập vào từ bài 1 topic 1).
        Nếu không có thì hiển thị -1.
         */

        int a[] = Topic1.inputArray();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;

        for (int i: a) {
            if (i >= x && i <= y) count ++;
        }

        if (count == 0) System.out.println(-1);
        else System.out.println(count);
    }

    public void bai5() {
        /**
         * Bài 5: Hiển thị các giá trị trùng nhau trong mảng số nguyên A (đã được nhập vào từ bài 1
         * topic 1). Nếu không có thì hiển thị 0;
         */
        int a[] = Topic1.inputArray();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                System.out.println("index " + b.indexOf(a[i]));
                if (a[i] == a[j] && b.indexOf(a[i]) == -1 ) b.add(a[i]);
            }
        }

        if (b.isEmpty()) System.out.println(0);
        else {
            for (Integer i: b) {
                System.out.print(i + " ");
            }
        }
    }

    public void bai6() {
        /**
         * Bài 6: Viết hàm đếm xem có bao nhiêu phần tử còn thiếu trong mảng số nguyên A chưa
         * được sắp xếp (đã được nhập vào từ bài 1 topic 1). Nếu không có thì trả về 0. Chú ý: Các
         * giá trị còn thiếu trong mảng nằm trong khoảng giá trị nhỏ nhất và lớn nhất trong mảng A;
         */

        int a[] = Topic1.inputArray();
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        for (int i = min + 1; i < max ; i++) {
            boolean isExist = false;
            for (int item: a) {
                if (item == i) {
                    isExist = true;
                    break;
                }
                if (!isExist) System.out.print(i + " ");
            }
        }

    }

    public void bai7() {
        /**
         * Bài 7: Viết hàm đếm xem có bao nhiêu phần tử có giá trị Nhỏ hơn X nhưng lớn hơn Y
         * trong mảng số nguyên A (đã được nhập vào từ bài 1 topic 1).
         */

        int a[] = Topic1.inputArray();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int count  = 0;
        for (int item: a) {
            if (item < x && item > y) count ++;
        }
    }

    public void bai8() {
        /**
         * Bài 8: Viết Hàm in ra tất cả các cặp duy nhất trong mảng số nguyên A chưa được sắp xếp
         * có tổng bằng nhau.
         */

    }

    public void bai9() {
        /*
        Bài 9: Nghiên cứu và cài đặt thuật toán tìm kiếm tuyến tính 2 chiều (Two Way Linear
        Search) trên mảng số nguyên 1 chiều
         */
        int a[] = Topic1.inputArray();
        int first = 0;
        int last = a.length - 1;
        int count = 0;

        int x = scanner.nextInt();
        while (first < last ) {
            if (a[first] == x || a[last] == x) {
                count = 1;
                break;
            } else  {
                first ++;
                last --;

            }
        }
    }

    public void bai10() {
        /**
         * Bài 10: Tìm giá trị nhỏ nhất còn thiếu trong mảng số nguyên dương A (Đã nhập vào ở
         * Bài 1, Topic 1).
         */

        int a[] = Topic1.inputArray();
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }

        for (int i=0 ; i < max; i++) {
            boolean isInA = false;
            for (int item: a) {
                if (item == a[i]) {
                    isInA = true;
                    break;
                }
            }

            if (!isInA) {
                System.out.print(i);
                break;
            }
        }

    }
}
