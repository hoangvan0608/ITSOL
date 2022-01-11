package ITSOL.CoreConcepts.Array;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        inputArr(a,scanner);
        int lengthArr = a.length;
        int count[][] = new int[lengthArr][2];
        for (int i = 0; i < a.length; i++)
        {
            if(getIndex(a[i],count))
            {
                continue;
            }
            else
            {
                int dem=1;
                for (int j = i+1; j < a.length ; j++) {
                    if(a[i] == a[j])
                    {
                        dem++;
                    }
                }
                count[i][0] = a[i];
                count[i][1] = dem;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(count[i][1] ==0 )
            {
                continue;
            }
            System.out.println(String.format("Số %d xuất hiện %d lần!",count[i][0],count[i][1]));
        }
        int max = 0;
        int vitri = 0;
        for (int i = 0; i < a.length; i++) {
            if(count[i][1] > max)
            {
                max = count[i][1];
                vitri = i;
            }
        }
        System.out.println(String.format("Số %d xuất hiện nhiều nhất %d lần",count[vitri][0],count[vitri][1]));



    }
    public static void inputArr(int[] a,Scanner scanner)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }
    public static boolean getIndex(int a, int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if(a == arr[i][0])
            {
                return true;
            }
        }
        return false;
    }
}
