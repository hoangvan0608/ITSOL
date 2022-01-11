package ITSOL.CoreConcepts.Array;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length1,length2,p;

        System.out.print("Nhập số phần tử của mảng a: ");
        length1 = scanner.nextInt();
        System.out.println("Mời bạn nhập phần tử của mảng: ");
        int[] a = new int[length1];
        inputArr(a,scanner);

        System.out.print("Nhập số phần tử của mảng b: ");
        length2 = scanner.nextInt();
        System.out.println("Mời bạn nhập phần tử của mảng: ");
        int[] b = new int[length2];
        inputArr(b,scanner);

        int newLength = length1 + length2;
        int newArr[] = new int[newLength];


        System.out.println(String.format("Mời bạn nhập vị trí p muốn trèn mảng (%d <= p < %d): ",0,length1));
        p = scanner.nextInt();


        if(p >=0 && p<length1)
        {
            for (int i = 0,j=0; i < newLength ; i++) {
                if(i<p)
                {
                    newArr[i] = a[i];
                }


                else if(p <=i && i < p + length2) {
                    newArr[i] = b[j];
                    j++;
                }


                else if (i >= p+length2)
                {
                    newArr[i] = a[i - length2];
                }

            }
        }
        else {
            System.out.println("Vị trí "+p+" không tồn tại trên mảng!");
        }
        for (int i: newArr) {
            System.out.print(i+" ");
        }

    }
    public static void inputArr(int[] a, Scanner scanner)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
    }
}
