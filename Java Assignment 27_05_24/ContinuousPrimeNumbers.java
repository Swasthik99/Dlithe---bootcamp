// If the array contains any three continuous prime numbers, write a program to return true. Else return false.

public class ContinuousPrimeNumbers {
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean hasThreeContinuousPrimes(int[] a) {
        int count = 0;
        for (int num : a) {
            if (isPrime(num)) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 11, 13, 17, 23};
        System.out.println(hasThreeContinuousPrimes(a));
    }
}
