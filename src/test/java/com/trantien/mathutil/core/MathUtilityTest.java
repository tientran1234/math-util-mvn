/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.trantien.mathutil.core;


import com.trantien.mathuntil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mac
 */
public class MathUtilityTest {
    //TEST CASE TEMPLATE/STRUCTURE
    //ID |DESC|STEPS/PROCEDURES|EXPECTED VALUE|STATUS(PASS/FAILED)
    //Test case #1:verify the getFactorial with n=0
    //step procedures:
    // 1:given n=0
    //2:call/invoke getFactorial(int n)
    //expected result
    // the method getFactorial(n=0) must be return 1
    // as the result of 0!==1
    //status:passed| failed đoán xem  khi chạy app/hàm/method
        
   @Test //dính dáng đến thuật ngữ framework
    public void verifyFactorialGivenRightArgument0ReturnsOK(){
       assertEquals(1,MathUtility.getFactorial(0));
   }
    @Test //dính dáng đến thuật ngữ framework
    public void verifyFactorialGivenRightArgument1ReturnsOK(){
       assertEquals(1,MathUtility.getFactorial(1));
   }
     @Test //dính dáng đến thuật ngữ framework
    public void verifyFactorialGivenRightArgument6ReturnsOK(){
       assertEquals(720,MathUtility.getFactorial(6));
   }
  
    
}
