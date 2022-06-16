/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javafxapplication13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Arley
 */
public class NewJFrame1Test {
    
    public NewJFrame1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of escogerpregunta method, of class NewJFrame1.
     */
    @Test
    public void testEscogerpregunta() {
        System.out.println("escogerpregunta");
        int n = 0;
        Ciencias instance = new Ciencias();
        instance.escogerpregunta(n);
        // TODO review the generated test code and remove the default call to fail.
        assetTrue("The test case is a prototype.");
    }

    /**
     * Test of mostrarpregunta method, of class NewJFrame1.
     */
    @Test
    public void testMostrarpregunta() {
        System.out.println("mostrarpregunta");
        Ciencias instance = new Ciencias();
        instance.mostrarpregunta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escogerrespuesta method, of class NewJFrame1.
     */
    @Test
    public void testEscogerrespuesta() {
        System.out.println("escogerrespuesta");
        int n = 0;
        Ciencias instance = new Ciencias();
        instance.escogerrespuesta(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jugar method, of class NewJFrame1.
     */
    @Test
    public void testJugar() {
        System.out.println("jugar");
        Ciencias instance = new Ciencias();
        instance.jugar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class NewJFrame1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ciencias.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
