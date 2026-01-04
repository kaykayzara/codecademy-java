/*
Project: Continents and Cities (Codecademy – Learn Java)

Summary:
- Print a continent name and its largest city based on an integer input.
- Practice using the Java switch statement for control flow.
- Map numeric values (1-7) to continent/city pairs.
- Demonstrate cleaner alternative to multiple if/else statements.

Input:
- Integer value representing a continent (1-7)

Output:
- Continent name and its largest city

Concepts practiced:
- Switch statements (case/break/default)
- Control flow and decision making
- Integer-based routing logic
- String output formatting
- Code organization and readability

Run:
javac Continents.java
java Continents
*/

public class Continents {

    public static void main(String[] args) {
        int continent = 4;
        switch (continent) {
            case 1:
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 2:
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3:
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4:
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7:
                System.out.println("Antarctica: McMurdo Station, US");
            break;
        }
    }
}