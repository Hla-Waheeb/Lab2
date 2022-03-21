import java.util.Arrays;

public class CopyingArray {
    public static void main(String[] args) {

        System.out.println( "CopyingArray ="+ Arrays.toString(copy()));
    }
    public static int[] copy() {
        int[] f = {1,2,3,4,5};
        int[] c = new int[f.length];
        c = f;
        return c;
    }
}
