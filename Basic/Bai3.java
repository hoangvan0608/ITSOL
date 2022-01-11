package ITSOL.CoreConcepts.Basic;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();
        System.out.println(String.format("Ước chung lớn nhất của %d và %d là %d",a,b,timUCLN(a,b)));
        System.out.println(String.format("Bội chung nhỏ nhất của %d và %d là %d",a,b,timBCNN(a,b)));

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
    public static int timBCNN(int a,int b)
    {
        return (a*b)/timUCLN(a,b);
    }
}
