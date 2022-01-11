package ITSOL.CoreConcepts.Basic;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đoạn [a,b] (a>b):");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        if(a<b)
        {
            System.out.println("Các cặp số nguyên tố trong đoạn từ "+a+" đến "+b+" là: ");
            for (int i = a; i < b; i++)
                for (int j = a+1; j <= b ; j++)
                {
                    if(j>i && timUCLN(i,j) ==1)
                    {
                        System.out.println(String.format("(%d,%d) ",i,j));
                    }
                }
        }
    }

    public static int timUCLN(int a,int b)
    {
        while (a!=b)
        {
            if(a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
        }
        return a;
    }
}
