/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcdc2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manahil Khalid
 */
public class ApplyMCDCTest1 {
    
    public ApplyMCDCTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    ApplyMCDC m1;
    @Before
    public void setUp() {
        System.out.println("Before method call");
         m1=new ApplyMCDC();
    }
    
    @After
    public void tearDown() {
    }

    //True
    @Test
    public void N1TestTrue() {
        System.out.println("N1 True");
        assertTrue(m1.LargestNumber(4, 1, 0, 2)==4);
    }
    
    @Test
    public void N2TestTrue() {
        System.out.println("N2 True");
        assertTrue(m1.LargestNumber(1, 4, 0, 2)==4);
    }
    
    @Test
    public void N3TestTrue() {
        System.out.println("N3 True");
        assertTrue(m1.LargestNumber(5, 1, 1, 6)==6);
    }
    
    @Test
    public void N4TestTrue() {
        System.out.println("N4 True");
        assertTrue(m1.LargestNumber(1, 4, 0, 2)==4);
    }
    
    
    }
    

