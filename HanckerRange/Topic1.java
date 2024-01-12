package HanckerRange;

import java.util.Random;
import java.util.Scanner;

public class Topic1 {

    public static void main(String[] args) {
        Topic1 arrayAsigment = new Topic1();
        arrayAsigment.bai10();
    }

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt(); // Nhap cac phan tu trong day.
        }
        return a;
    }

    public void bai2() {
//        Bài 2: Viết hàm sinh ra N giá trị số nguyên bất kỳ cho mảng và hiển thị các giá trị trong
//        mảng ra màn hình (N nhập vào từ bàn phím)

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt();
            a[i] = value;
        }

        for (int item: a) {
            System.out.print(item + " ");
        }

    }

    public void bai3() {
        /**
         * Bài 3: Viết hàm hiển thị các giá trị chẵn trong mảng số nguyên chứa N phần tử (N nhập
         * vào từ bàn phím). Các giá trị của mảng được nhập từ hàm đã viết ở Bài 1.
         */
        int a[] = inputArray();

        for (int item: a) {
            if (item%2 == 0) System.out.print(item + " ");
        }

    }

    public void bai4() {
        /**
         * Bài 4: Viết hàm chứa các giá trị CHẴN trong mảng số nguyên A chứa N phần tử (N nhập
         * vào từ bàn phím) vào mảng số nguyên CHẴN B. Các giá trị của mảng A được nhập từ
         * hàm đã viết ở Bài 1.
         */

        int a[] = inputArray();
        int b[] = new int[101];

        int iA = 0;
        int iB = 0;
        while (iA < a.length) {
            if (a[iA]%2 == 0) {
                b[iB] = a[iA];
                iB ++;
            }
            iA ++;
        }
    }

    public void bai5() {
        /**
         * Bài 5: Viết hàm chứa các giá trị LẺ trong mảng số nguyên A chứa N phần tử (N nhập vào
         * từ bàn phím) vào mảng số nguyên LẺ B. Các giá trị của mảng A được nhập từ hàm đã
         * viết ở Bài 1.
         */

        int a[] = inputArray();
        int b[] = new int[101];

        int iA = 0;
        int iB = 0;
        while (iA < a.length) {
            if (a[iA]%2 != 0) {
                b[iB] = a[iA];
                iB ++;
            }
            iA ++;
        }
    }

    public int bai6(int[] a) {
        /**
         * Bài 6: Viết hàm tính tổng các giá trị trong mảng số nguyên bất kỳ và áp dụng tính tổng
         * các giá trị số nguyên trong mảng Chẵn và Lẻ ở Bài 4 và 5;
         */

        int sum = 0;
        for (int item: a) {
            sum += item;
        }
        return sum;
    }

    public int[] bai7(int[] a, int n, int x, int y) {
        /**
         * Bài 7. Viết hàm Thêm 01 phần tử có giá trị X vào vị trí Y trong mảng số nguyên bất kỳ
         * (Mảng số nguyên đã nhập trước đó);
         */

        for (int i = n-1; i>= x; i--) {
            a[i+1] = a[i];
        }
        a[x] = y;

        return a;
    }

    public int[] bai8(int[] a, int n, int y) {
        /**
         * Bài 8. Viết hàm Xóa 01 phần tử ở vị trí Y trong mảng số nguyên bất kỳ (Mảng số nguyên
         * đã nhập trước đó);
         */

        for (int i=y; i<n; i++) {
            a[i] = a[i+1];
        }
        return a;
    }

    public int[] bai9(int a[], int m, int n[], int k[]) {
        /**
         * Bài 9: Viết hàm Thêm N giá trị (N < 5 và được nhập vào từ bàn phím) vào các vị trí được
         * xác định trong mảng K (Khai báo trước hoặc nhập vào các vị trí cần chèn) vào mảng số
         * nguyên A cho trước hoặc nhập vào (mảng A có kích thước M); Gợi ý: Nên sử dụng hàm
         * ở bài 7 để giải quyết bài toán;
         */

       for (int i=0 ; i < n.length; i++) {
           a = bai7(a, m, n[i], k[i]);
       }

       return a;
    }

    public void bai10() {
        /*
            Bài 10: Viết đoạn chương trình:
            a) Nhập số lượng (N) Học viên, khai báo mảng chứa tên học viên, mảng chứa điểm
            Topic: SQL Basic, mảng chưa điểm Java Basic và mảng chứa Java Advanced cho
            từng học viên
            b) Viết hàm Nhập tên học viên, nhập điểm các topic của từng học viên: SQL Basic,
            Java Basic, Java Advanced vào các mảng tương ứng
            c) Hiển thị các giá trị đã nhập vào các mảng ở b)
            d) Tính và hiển thị điểm trung bình của các học viên
            e) Viết hàm hiển thị các học viên có điểm trung bình chung các Topic &gt;= 6.5
         */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String name[] = new String[n];
        Float sqlBasic[] = new Float[n];
        Float javaBasic[] = new Float[n];
        Float javaAdvanced[] = new Float[n];

        while (true) {

            System.out.println("---- Nhập lựu chon của bạn ---- ");
            System.out.println("1. Nhập tên ");
            System.out.println("2. Nhập điểm sql basic");
            System.out.println("3. Nhập điểm java basic");
            System.out.println("4. Nhập điểm java advance");
            System.out.println("5. Hiển thị tất cả các mảng");
            System.out.println("6. Điểm trung bình của các học viên");
            System.out.println("7. Danh sách học viên có điểm trung bình >= 6.5");
            System.out.println("0. Thoát chương trình");
            System.out.println("**********************************");

            int i = scanner.nextInt();

            switch (i) {
                case 1:
                    nhapTen(name, n);
                    break;
                case 2:
                    nhapDiem(sqlBasic, n);
                    break;
                case 3:
                    nhapDiem(javaBasic, n);
                    break;
                case 4:
                    nhapDiem(javaAdvanced, n);
                    break;
                case 5:
                    display(name, sqlBasic, javaBasic, javaAdvanced, n);
                    break;
                case 6:
                    diemTb(name,  sqlBasic, javaBasic, javaAdvanced, n);
                    break;
                case 7:
                    diemTbLon(name,  sqlBasic, javaBasic, javaAdvanced, n);
                    break;
                case 0:
                    return;

            }


        }

    }

    public void nhapTen(String name[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < n; i++) {
            String ten = sc.nextLine();
            name[i] = ten;
        }
    }

    public void nhapDiem(Float diem[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            diem[i] = sc.nextFloat();
        }
    }

    public void display(String name[], Float sqlBasic[], Float javaBasic[], Float javaAdvance[], int n) {
        System.out.println("Ten   SqlBasic   JavaBasic     JavaAdvance");
        for (int i = 0; i < n; i++ ) {
            System.out.println(name[i] + " " + sqlBasic[i] + "    " + javaBasic[i] + "   " + javaAdvance[i] );
        }
    }

    public void diemTb(String name[], Float sqlBasic[], Float javaBasic[], Float javaAdvance[], int n) {
        System.out.println("Diem trung binh");
        for (int i = 0; i < n; i++ ) {
            float tb =  (sqlBasic[i]  + javaBasic[i]  + javaAdvance[i])/3;
            System.out.println(name[i] + " " + tb );
        }
    }

    public void diemTbLon(String name[], Float sqlBasic[], Float javaBasic[], Float javaAdvance[], int n) {
        System.out.println("Diem trung binh");
        for (int i = 0; i < n; i++ ) {
            float tb =  (sqlBasic[i]  + javaBasic[i]  + javaAdvance[i])/3;
            if (tb >= 6.5) System.out.println(name[i] + " " + tb );
        }
    }
}
