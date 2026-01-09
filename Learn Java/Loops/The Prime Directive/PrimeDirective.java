/*
Project: Prime Directive (Codecademy - Learn Java)

Summary:
- Build a method to determine if a number is prime
- Create an ArrayList of all prime numbers from an array
- Practice using loops and conditional logic for prime number detection
- Demonstrate efficient algorithm design and testing

Input:
- Integer array containing numbers to test for primality

Output:
- ArrayList containing only the prime numbers from the input array

Concepts practiced:
- Method creation and parameters
- Loops (for loop with conditional logic)
- Boolean logic and return values
- ArrayList manipulation
- Prime number algorithm implementation
- Edge case handling (2 and numbers less than 2)

Run:
javac PrimeDirective.java
java PrimeDirective
*/

// Import statement:
import java.util.ArrayList;

class PrimeDirective {
    // Add your methods here:
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(pd.isPrime(7));
        System.out.println(pd.isPrime(28));
        System.out.println(pd.isPrime(2));
        System.out.println(pd.isPrime(0));

        System.out.println(pd.onlyPrimes(numbers));
    }  

}
