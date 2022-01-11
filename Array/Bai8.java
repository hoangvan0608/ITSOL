package ITSOL.CoreConcepts.Array;

import java.util.Scanner;

public class Bai8 {
    static Scanner in = new Scanner(System.in);
    public static void print(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] nhan(int[][] a, int[][] b){
        int m = a.length;
        int n = b[0].length;
        int[][] c = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
            {
                c[i][j] = 0;
                int s = 0;
                for (int k = 0; k < m; k++) {
                    s +=a[i][k]*b[k][j];
                }
                c[i][j] = s;
            }
        }
        return c;
    }

    public static void main(String[] args) {

        int[][] a = {{1,1,1},{1,1,2},{1,1,3}};
        int[][] b = {{3,1},{3,2},{3,3}};

        System.out.println("ma tran a: ");
        print(a);
        System.out.println("ma tran b: ");
        print(b);
        int[][] c = nhan(a,b);
        System.out.println("ma tran tich: ");
        print(c);


    }
}
