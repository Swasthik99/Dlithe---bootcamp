public class ContinuousNumbers {
    public static boolean ThreeContinuousNumbers(int[] a) {
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i + 1] == a[i] + 1 && a[i + 2] == a[i] + 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 7, 10};
        System.out.println(ThreeContinuousNumbers(a)); // true
    }
}

