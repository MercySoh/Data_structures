/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author asus
 */
public class BoundedPriorityQueueSetTest {
    
    public BoundedPriorityQueueSetTest() {
    }

    /**
     * Test of size method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testSize_EmptyQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isEmpty method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BoundedPriorityQueueSet instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        BoundedPriorityQueueSet instance = null;
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Task value = null;
        BoundedPriorityQueueSet instance = null;
        boolean expResult = false;
        boolean result = instance.add(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        BoundedPriorityQueueSet instance = null;
        Task expResult = null;
        Task result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        BoundedPriorityQueueSet instance = null;
        Task expResult = null;
        Task result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}