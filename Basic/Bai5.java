package ITSOL.CoreConcepts.Basic;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào số nguyên: ");
        int n = scanner.nextInt();

        System.out.println("Tổng: "+tongCacChuSo(n));

    }
    public static int tongCacChuSo(int n)
    {
        int c = 0, tong  = 0;
        while (n!=0)
        {
            c = n%10;
            tong+=c;
            n/=10;
        }
        return tong;
    }
}
