// Given an array with n number of elements.
// Print all prime numbers from the given array.

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    public static void printPrimes(int[] array) {
        System.out.println("Prime numbers in the array:");
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        printPrimes(array);
    }
}
