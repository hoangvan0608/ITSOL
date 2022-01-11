package ITSOL.CoreConcepts.Basic;

public class Bai8 {
    public static void main(String[] args) {
        int so1,so2,daonguoc = 0;
        System.out.println("Danh sách số thuận nghịch có 6 chữ số mà tổng của chúng chia hết cho 10 là: ");
        for (int i = 100001; i <=999999 ; i++) {
            so1 = i;
            so2 = so1;
            daonguoc = 0;
            while(so1 != 0) {
                int digit = so1 % 10;
                daonguoc = daonguoc * 10 + digit;
                so1 /= 10;
            }
            if(daonguoc == so2 && tongCacChuSo(daonguoc) % 10 ==0)
            {
                System.out.print(so2+" ");
            }

        }
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
