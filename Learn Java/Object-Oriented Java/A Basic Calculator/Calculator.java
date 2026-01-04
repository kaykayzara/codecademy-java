/*
 Project: A Basic Calculator (Codecademy – Learn Java)

 Summary:
 - Build a simple integer calculator using Java classes, methods, and objects.
 - Operations implemented: add, subtract, multiply, divide, modulo.
 - Demonstrate usage in main() by constructing a Calculator and printing results.

 Concepts practiced:
 - Class/constructor design, method signatures & return types
 - main(String[] args) entry point
 - Integer arithmetic and console output

 Run:
   javac Calculator.java
   java Calculator
*/

// 1) Define a public class named Calculator.
public class Calculator {
  // 2) Add a public no-arg constructor: Calculator() { }.
  public Calculator() {
  }
  // 3) Declare a public method: int add(int a, int b).
  public int add(int a, int b) {
    // 4) Ensure add takes two int parameters.
    // 5) In add, return a + b.
    return a + b;
  }
  // 6) Declare a public method: int subtract(int a, int b).
  public int subtract(int a, int b) {
    // 7) In subtract, return a - b.
    return a - b;
  }
  // 8) Declare a public method: int multiply(int a, int b).
  public int multiply(int a, int b) {
    // 9) In multiply, return a * b.
    return a * b;
  }
  // 10) Declare a public method: int divide(int a, int b).
  public int divide(int a, int b) {
    // 11) In divide, return a / b. // integer division; throws on b == 0
    return a / b;
  }
  // 12) Declare a public method: int modulo(int a, int b).
  public int modulo(int a, int b) {
    // 13) In modulo, return a % b.
    return a % b;
  }
  // 14) Define public static void main(String[] args).
  public static void main(String[] args) {
    // 15) In main, create Calculator myCalculator = new Calculator();
    Calculator myCalculator = new Calculator();
    // 16) Print myCalculator.add(5, 7);    // expected 12
    System.out.println(myCalculator.add(5, 7));
    // 17) Print myCalculator.subtract(45, 11); // expected 34
    System.out.println(myCalculator.subtract(45, 11));
  }
}
// 18) Verify outputs match 12 and 34.
