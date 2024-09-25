package com.example.project;
public class Calculator{
    public String calcModel;
    
    //constructor that creates an instance of the calculator class
    public Calculator(String calc) {
        calcModel = calc;
    }
    
    // get operand input and goes through a bunch of if statements to see which operator is chosen and used
    // if it doesn't find an appropriate operator, it'll return a zero
    public double performOperation(String operand, int num1, int num2) {
        if (operand.equals("+")){
            return num1 + num2;
        } if (operand.equals("-")) {
            return num1 - num2;
        } if(operand.equals("*")) {
            return num1 * num2;
        } if(operand.equals("/")) {
            return num1 / num2;
        } else {
            return 0.00;
        }
    }

    // method that checks if num1 is evenly divisible by num2, and if so,
    // returns true, and if not, returns false
    public boolean divisibleBy(int num1, int num2) {
        if (num1 % num2 == 0){
            return true;
        } else{
            return false;
        }
    }

    // method that constructs and returns a string representing a coordinate
    // pair in the format: "(x, y)"
    // (THIS METHOD DOES NOT PRINT)
    public String coordinatePair(int x, int y) {        
        return "(" + x + "," + y + ")";
    }
    // method that determines and returns the result of |num1 - num2|
    // (THIS METHOD DOES NOT PRINT)
    public int absoluteValue(int num1, int num2) {
        if (num1 - num2 > 0) {
            return (num1 - num2);
        } else {
            return (-1 * (num1 - num2));
        }
    }
    
    // method that constructs and returns a String in the format:
    // "This calculator is a model "+____+" where "+____+" should be filled in
    // with the value stored in the calcModel instance variable."
    // (THIS METHOD DOES NOT PRINT)
    public String info() {
        return "This calculator is a model "+ calcModel +" where "+ calcModel + " should be filled in with the value stored in the calcModel instance variable.";
    }
}
