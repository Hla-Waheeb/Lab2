import java.util.Arrays;
import java.util.Random;

public class RandomEntry {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,6};
        System.out.println(Arrays.toString(remove(a)));
    }

    public static int[] remove(int[] x) {
        Random r = new Random();
        int index = r.nextInt(x.length - 1);
        System.out.println(index);
        for (int i = 0; i < x.length; i++) {
            if (index <= i) {
                x[i] = 0;
            }

        }
        return x;
    }

}
