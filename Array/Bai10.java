package ITSOL.CoreConcepts.Array;

public class Bai10 {
    static int sumx(int[][] a){
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                // đường chéo chính
                if(i == j){
                    s +=a[i][j];
                }
                // đường chéo phụ
                if(i + j ==a.length-1){
                    s+=a[i][j];
                }
            }
        }
        if(a.length%2!=0) s = s - a[a.length/2][a.length/2];
        return s;
    }
    static void print(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1,1,3},{2,2,4},{3,3,6}};
        System.out.println("Ma trận của bạn:");
        print(a);
        System.out.println("tong cac phan tu tren duong cheo chinh va phu: "+sumx(a));

    }
}
