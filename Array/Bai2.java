package ITSOL.CoreConcepts.Array;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        inputArr(a,scanner);
        sortArr(a);

    }
    public static void inputArr(int[] a, Scanner scanner)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }
    public static void sortArr(int a[])
    {
        for (int i = 0; i < a.length -1; i++)
            for (int j = i+1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        System.out.println("Mảng sau khi sắp xếp tăng dần là: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
