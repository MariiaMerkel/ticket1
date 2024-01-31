import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        reverseArray(new int[]{1, 2, 3});

    }

    public static void reverseArray(int[] array) {
        int l = array.length -1;
        for (int i = 0; i < (l + 1) / 2; i++) {
            array[i] = array[i] + array[l - i];
            array[l - i] = array[i] - array[l - i];
            array[i] = array[i] - array[l - i];
        }
        System.out.println(Arrays.toString(array));
    }
}