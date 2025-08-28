// Create a program that performs a mathematical magic trick

public class mathMagic {
    public static void main(String[] args) {

        // original number
        int myNumber = 3;

        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);
    }
}