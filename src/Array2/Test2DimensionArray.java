package Array2;

import java.util.Arrays;

public class Test2DimensionArray {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0]=new int[]{20,30};
        a[1]=new int[]{10,20,30};
        a[2]=new int[]{20,30,66,77};
        System.out.println(a[1][2]);
        for (int[]b:a){
            System.out.println(Arrays.toString(b));
        }

    }
}
