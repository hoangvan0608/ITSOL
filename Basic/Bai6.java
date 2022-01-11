package ITSOL.CoreConcepts.Basic;

import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        do {
            System.out.print("Nhập số nguyên dương n = ");
            n = scanner.nextInt();
        } while (n < 2);

        int[] a = new int[20];
        phanTichSoNguyen(n,a);
        if(a[0] !=0)
        {
            System.out.print(a[0]);
            for (int i = 1; i < a.length; i++) {
                if(a[i] != 0)
                    System.out.print(" x "+a[i]);
                else
                    break;
            }
            System.out.print(" = "+n);
        }
        else {
            System.out.println(n+" là số nguyên tố");
        }


    }
    public static int[] phanTichSoNguyen(int n,int[] a) {
        int i = 2;
        int j=0;
        while (n>1)
        {
            if(n%i ==0)
            {
                n /=i;
                a[j] = i;
                j++;
            }
            else
            {
                i++;
            }
        }


        return a;
    }
}
