/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwolab.lab03.seq;

import java.math.BigDecimal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Michal
 */
public class LucasGeneratorTest {
    
    @Test
 public void testReset() {
 System.out.println("reset");
 LucasGenerator instance = new LucasGenerator();
 instance.reset();
 BigDecimal expResult = new BigDecimal(2);
 BigDecimal result = instance.nextTerm();
 assertEquals(expResult, result);
 }


 @Test
 public void testNextTerm() {
 System.out.println("nextTerm");
 LucasGenerator instance = new LucasGenerator();
 instance.nextTerm();
 BigDecimal expResult = new BigDecimal(2);
 BigDecimal result = instance.nextTerm();
 assertEquals(expResult, result);
 }

 @Test void testGetTerm() {
 System.out.println("getTerm");
 LucasGenerator instance = new LucasGenerator();
 BigDecimal expResult = new BigDecimal(55);
 BigDecimal result = instance.getTerm(10);
 assertEquals(expResult, result);
 }
    
}
