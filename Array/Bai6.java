package ITSOL.CoreConcepts.Array;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] a = new int[100];
        inputArr(a,scanner,n);
        sortArr(a,n);
        System.out.print("Nhập vào một số bất kì muốn chèn vào mảng: ");
        int x = scanner.nextInt();
        int vitri=getIndex(a,n,x);
        int last = getLastIndex(a);
        inSertIndex(a,vitri,x);
        showArr(a,n);
//        System.out.print(last);

    }
    public static void inputArr(int[] a, Scanner scanner, int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }
    public static int getLastIndex(int[] a)
    {
        return a[a.length-1];
    }
    public static void sortArr(int[] a,int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void showArr(int a[],int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }
    }
    public static int getIndex(int[] a, int n, int x)
    {
       if(x < a[0])
       {
           return 0;
       }
       if(x > a[n-1])
       {
           return n-1;
       }
       for (int i = 0; i < a.length; i++)
       {
            if(a[i] >= x)
                return i;
        }
       return -1;

    }
    public static void inSertIndex(int[] a, int vitri, int x)
    {

        for (int i = a.length-1; i>vitri; i--)
        {
            a[i] = a[i-1];
        }
        a[vitri] = x;

    }
}
