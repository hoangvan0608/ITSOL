package ITSOL.CoreConcepts.Basic;

import java.util.Scanner;

public class Bai1 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập n = ");
        int n = Integer.parseInt(scanner.nextLine());
        tinhTongPhanSo(n);
        tinhTongSoNguyen(n);
    }
    public static void tinhTongSoNguyen(int n)
    {
        int tong = 0;
        if(n % 2 == 0)
        {
            for (int i=2; i<=n; i=i+2)
            {
                tong +=i;
            }
        }
        else
        {
            for (int i=1; i<=n; i=i+2)
            {
                tong +=i;
            }
        }
        System.out.println("Tổng là : "+tong);
    }
    public static void tinhTongPhanSo(int n)
    {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += 1.0/i;
        }
        System.out.println("Tổng phân số là: "+(double)Math.round(tong*100)/100);
    }

}
