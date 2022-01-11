package ITSOL.CoreConcepts.Basic;

public class Bai10 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 10000000 ; i++) {
            if(kiemTraSoThuanNghich(i) && soNguyenTo(i))
            {
                System.out.println(i);
            }
        }
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
    public static boolean kiemTraSoThuanNghich(int n)
    {
        int so1,so2,daonguoc = 0;
        so1 = n;
        so2 = so1;
        while(so1 != 0) {
            int digit = so1 % 10;
            if(soNguyenTo(digit))
            {
                daonguoc = daonguoc * 10 + digit;
                so1 /= 10;
            }
            else {
                return false;
            }

        }
        if(daonguoc != so2) {
            return false;
        }
        return true;
    }
}
