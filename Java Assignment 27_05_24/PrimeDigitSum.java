// Given an array with n number of elements.
// Return true if sum of the digits of a prime number is again a prime number from the array.
// Else return false.

public class PrimeDigitSum {

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isSumOfDigits(int[] array) {
        for (int num : array) {
            if (isPrime(num)) {
                int digitSum = sumOfDigits(num);
                if (isPrime(digitSum) && contains(array, digitSum)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println(isSumOfDigits(array));
    }
}

