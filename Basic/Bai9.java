package ITSOL.CoreConcepts.Basic;

public class Bai9 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 1000000000; i++) {
            if(kiemTraSoThuanNghich(i) && kiemTraChuSo068(i) && tongCacChuSo(i) % 10 ==0)
            {
                System.out.println(i);
            }
        }
    }
    public static boolean kiemTraSoThuanNghich(int n)
    {
        int so1,so2,daonguoc = 0;
            so1 = n;
            so2 = so1;
            while(so1 != 0) {
                int digit = so1 % 10;
                daonguoc = daonguoc * 10 + digit;
                so1 /= 10;
            }
            if(daonguoc != so2) {
                return false;
            }
        return true;
    }
    public static boolean kiemTraChuSo068(int n)
    {
        while(n != 0) {
            int digit = n% 10;
            if(digit == 0 || digit == 6 || digit == 8)
            {
                n/=10;
            }
            else{
                return false;
            }
        }
        return true;
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
