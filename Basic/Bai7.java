package ITSOL.CoreConcepts.Basic;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 111111; i<= 999999; i+=2)
        {
            if(checkSoLe(i))
            {
                if(soNguyenTo(i))
                {
                    System.out.println(i+" ");
                }
                else
                {
                    continue;
                }
            }

        }


    }
    public static boolean checkSoLe(int n)
    {
        int  check = 0;
        while (n!=0)
        {
            if(n %2 == 1)
            {
                n/=10;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
