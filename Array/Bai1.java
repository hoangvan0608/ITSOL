package ITSOL.CoreConcepts.Array;

import java.util.Scanner;

public class Bai1 {
    // Nhập mảng (a,n) và kiểm tra đối xứng
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        inputArr(a,scanner);
        if(checkArr(a))
        {
            System.out.println("Là mảng đối xứng");
        }
        else
        {
            System.out.println("Không đối xứng");
        }

    }
    public static void inputArr(int[] a,Scanner scanner)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }
    public static boolean checkArr(int[] a)
    {
        int length = a.length/2;
        for (int i = 0; i < length; ) {
            for (int j = a.length -1; j > length ; ) {
                if(a[i] == a[j])
                {
                    i++;
                    j--;
                }
                else
                {
                    return false;
                }
            }
        }

        return true;
    }
}
