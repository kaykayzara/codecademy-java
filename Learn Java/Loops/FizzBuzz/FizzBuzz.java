/*
Project: FizzBuzz (Codecademy - Learn Java)

Summary:
- Implement the classic FizzBuzz programming challenge
- Print numbers 1-100 with special rules for multiples
- Practice conditional logic and modulo operations
- Demonstrate control flow mastery

Rules:
- Print "Fizz" for multiples of 3
- Print "Buzz" for multiples of 5
- Print "FizzBuzz" for multiples of both 3 and 5
- Print the number itself otherwise

Output:
- Console output of numbers 1-100 following FizzBuzz rules

Concepts practiced:
- For loops and iteration
- Conditional statements (if/else if/else)
- Modulo operator (%) for divisibility checking
- String output formatting
- Logical operators and condition ordering

Run:
javac FizzBuzz.java
java FizzBuzz
*/

class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz\n");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}