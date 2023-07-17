import java.util.Arrays;

public class Chalenge1 {
    public static void main(String args[]) {
        int[] intArray = new int[]{ 10,36,50,45,5,6,8,7,9,4,3,2,1 };
        System.out.println(Arrays.toString(chalenge1(intArray)));
    }

    public static int[] chalenge1(int[] arr){
        Arrays.sort(arr);
        int[] Evens = FilterEvens(arr);
        int[] Odds = FilterOdds(arr);
        reverse(Odds);
        return concatenateArrays(Evens,Odds);
    }

    public static int[] FilterOdds(int[] arr){
        return Arrays
                .stream(arr)
                .filter(x -> x % 2 == 1)
                .toArray();
    }

    public static int[] FilterEvens(int[] arr){
        return Arrays
                .stream(arr)
                .filter(x -> x % 2 == 0)
                .toArray();
    }
    public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
    public static int[] concatenateArrays(int[] arr1,int[] arr2){
        int[] result = new int[ arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}