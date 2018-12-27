package Array2;


import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {

        int[] a={10,20,30,100,50,666,777,233,6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,30));
    }
}
