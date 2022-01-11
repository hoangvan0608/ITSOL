package ITSOL.CoreConcepts.Array;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        inputArr(a,scanner);
        System.out.print("Mời bạn nhập số x = ");
        int x = scanner.nextInt();
        int min = 1000,vitri = -1;
        for (int i = 0; i < a.length; i++) {
            if(soNguyenTo(a[i]) && Math.abs((a[i]-x))<min)
            {
                min = Math.abs((a[i]-x));
                vitri = i;
            }
        }
        if (vitri == -1)
        {
            System.out.println("Không tồn tại số nguyên tố nào trong mảng gần giá trị "+x);
        }
        else {
            System.out.println(a[vitri]+" là số nguyên tố gần "+x+" nhất");
        }
    }
    public static void inputArr(int[] a, Scanner scanner)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }
    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
