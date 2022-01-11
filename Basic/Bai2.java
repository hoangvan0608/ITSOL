package ITSOL.CoreConcepts.Basic;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        int dem = 0;
        int[] arr = new int[n];
        for (int i = 1,c=0; i <=n ; i++) {
            if(n%i==0)
            {
                arr[c] = i;
                c++;
                dem++;
            }
        }
        System.out.println("Số nguyên "+n+" có "+dem+" ước số! Đó là: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] !=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
