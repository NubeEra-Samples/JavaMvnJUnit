package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
      // Arrange
      final int expected = 4;
  
      // Act
      final int actual = Calculator.add(2, 2);
  
      // Assert
      assertEquals(expected, actual);
    }    
    @Test
    public void multiply_FourTimesTwo_ReturnsEight() {
      // Arrange
      final int expected = 8;
  
      // Act
      final int actual = Calculator.multiply(4, 2);
  
      // Assert
      assertEquals(expected, actual);
    }        

    @Test
    public void divide_TenDividedTwo_ReturnsFive() {
      // Arrange
      final int expected = 5;
  
      // Act
      final int actual = Calculator.divide(10, 2);
  
      // Assert
      assertEquals(expected, actual);
    }           
}