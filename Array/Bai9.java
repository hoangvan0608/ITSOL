package ITSOL.CoreConcepts.Array;

public class Bai9 {

    public static void main(String[] args) {
        int[][] a = {{1,3,2},{5,8,6},{4,7,2},{5,11,9}};
        System.out.println("Show the matrix:");
        sapXep(a);
    }
    public static void sapXep(int[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        int k = m*n;
        for (int i = 0; i < k-1; i++) {
            for (int j = i+1; j < k ; j++) {
                if(a[i/n][i%n] > a[j/n][j%n])
                {
                    int temp = a[i/n][i%n];
                    a[i/n][i%n] = a[j/n][j%n];
                    a[j/n][j%n] = temp;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
