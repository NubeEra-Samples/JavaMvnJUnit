package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public static int add(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }

  public static int multiply(int multiplicand, int multiplier) {
    return multiplicand * multiplier;
  }

  public static int divide(int dividend, int divisor) {
    if (divisor == 0)
      throw new IllegalArgumentException("Cannot divide by zero (0).");

    return dividend / divisor;
  }
  public static void main( String[] args )
  {
    System.out.println(Calculator.add(3, 3)); 
  }
}
