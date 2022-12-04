/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwolab.lab03.seq;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Michal
 */
public class SeqTypeTest {
    
    public SeqTypeTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of values method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testValues() {
 System.out.println("values");
 SeqType[] expResult
 = {SeqType.FIB, SeqType.LUC, SeqType.TRI};
 SeqType[] result = SeqType.values();
 assertArrayEquals(expResult, result);
 }

    /**
     * Test of valueOf method, of class SeqType.
     */


    /**
     * Test of fromString method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testFromString() {
 System.out.println("fromString");
 String type = "fibonaci";
 SeqType expResult = SeqType.FIB;
 SeqType result = SeqType.fromString(type);
 assertEquals(expResult, result);
 }


    /**
     * Test of getGenerator method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testGetGenerator()  {
 System.out.println("getGenerator");
 SeqType instance = SeqType.FIB;
 Generator result = instance.getGenerator();
 assertEquals(FibonacciGenerator.class, result.getClass());
 }

    
}
