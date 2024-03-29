/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.util.NoSuchElementException;
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
     * Test of size method, of class BoundedPriorityQueueSet with empty queue.
     */
    @Test
    public void testSize_EmptyQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class BoundedPriorityQueueSet with populate
     * queue.
     */
    @Test
    public void testSize_PopulatedQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Breana", "dance class", "2023-05-11"));
        instance.add(new Task("Caly", "dinner with family", "2023-05-11"));
        instance.add(new Task("Derek", "grocery shopping", "2023-05-11"));
        instance.add(new Task("Elton", "dish wash", "2023-05-11"));
        int expResult = 5;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class BoundedPriorityQueueSet with more than 10
     * queue.
     */
    @Test
    public void testSize_OversizeQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Breana", "dance class", "2023-05-11"));
        instance.add(new Task("Caly", "dinner with family", "2023-05-11"));
        instance.add(new Task("Derek", "grocery shopping", "2023-05-11"));
        instance.add(new Task("Elton", "dish wash", "2023-05-11"));
        instance.add(new Task("Felix", "dating", "2023-05-11"));
        instance.add(new Task("Gloria", "sing lesson", "2023-05-11"));
        instance.add(new Task("Hanah", "work day", "2023-05-11"));
        instance.add(new Task("Luna", "cooking class", "2023-05-11"));
        instance.add(new Task("Melisa", "clinic check", "2023-05-11"));
        assertThrows(IllegalStateException.class, () -> {
            instance.add(new Task("Nathen", "football", "2023-05-11"));
        });
    }

    /**
     * Test of isEmpty method, of class BoundedPriorityQueueSet with empty que.
     */
    @Test
    public void testIsEmpty_EmptyQue() {

        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class BoundedPriorityQueueSet with populated
     * que.
     */
    @Test
    public void testIsEmpty__PopulatedQue() {

        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Breana", "dance class", "2023-05-11"));
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of isFull method, of class BoundedPriorityQueueSet with empty que.
     */
    @Test
    public void testIsFull_EmptyQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
    }

    /**
     * Test of isFull method, of class BoundedPriorityQueueSet with populated
     * que.
     */
    @Test
    public void testIsFull_PopulatedQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Breana", "dance class", "2023-05-11"));
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
    }

    /**
     * Test of isFull method, of class BoundedPriorityQueueSet with max size
     * que.
     */
    @Test
    public void testIsFull_MaxSizeQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Breana", "dance class", "2023-05-11"));
        instance.add(new Task("Caly", "dinner with family", "2023-05-11"));
        instance.add(new Task("Derek", "grocery shopping", "2023-05-11"));
        instance.add(new Task("Elton", "dish wash", "2023-05-11"));
        instance.add(new Task("Felix", "dating", "2023-05-11"));
        instance.add(new Task("Gloria", "sing lesson", "2023-05-11"));
        instance.add(new Task("Hanah", "work day", "2023-05-11"));
        instance.add(new Task("Luna", "cooking class", "2023-05-11"));
        instance.add(new Task("Melisa", "clinic check", "2023-05-11"));
        boolean expResult = true;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
    }

    /**
     * Test of isFull method, of class BoundedPriorityQueueSet with over size
     * que.
     */
    @Test
    public void testIsFull_OversizeQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Breana", "dance class", "2023-05-11"));
        instance.add(new Task("Caly", "dinner with family", "2023-05-11"));
        instance.add(new Task("Derek", "grocery shopping", "2023-05-11"));
        instance.add(new Task("Elton", "dish wash", "2023-05-11"));
        instance.add(new Task("Felix", "dating", "2023-05-11"));
        instance.add(new Task("Gloria", "sing lesson", "2023-05-11"));
        instance.add(new Task("Hanah", "work day", "2023-05-11"));
        instance.add(new Task("Luna", "cooking class", "2023-05-11"));
        instance.add(new Task("Melisa", "clinic check", "2023-05-11"));
        assertThrows(IllegalStateException.class, () -> {
            instance.add(new Task("Nathen", "football", "2023-05-11"));
        });
    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet with one task.
     */
    @Test
    public void testAdd_TaskInEmptyQue() {
        Task value = new Task("Luca", "basketball", "2023-06-17");
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();

        int expResult = 0;
        int result = instance.add(value);
        assertEquals(expResult, result);

        int expSize = 1;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);
    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet with one task in
     * full que.
     */
    @Test
    public void testAdd_TaskInFullQue() {

        Task value = new Task("Luca", "basketball", "2023-06-17");

        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Breana", "dance class", "2023-05-11"));
        instance.add(new Task("Caly", "dinner with family", "2023-05-11"));
        instance.add(new Task("Derek", "grocery shopping", "2023-05-11"));
        instance.add(new Task("Elton", "dish wash", "2023-05-11"));
        instance.add(new Task("Felix", "dating", "2023-05-11"));
        instance.add(new Task("Gloria", "sing lesson", "2023-05-11"));
        instance.add(new Task("Hanah", "work day", "2023-05-11"));
        instance.add(new Task("Luna", "cooking class", "2023-05-11"));
        instance.add(new Task("Melisa", "clinic check", "2023-05-11"));

        assertThrows(IllegalStateException.class, () -> {
            instance.add(value);
        });

    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet with duplicate task.
     */
    @Test
    public void testAdd_DuplicateTask() {

        Task value = new Task("Luca", "basketball", "2023-06-17");

        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Caly", "dinner with family", "2023-05-11"));
        instance.add(new Task("Luca", "basketball", "2023-06-17"));
        assertThrows(DuplicateElementException.class, () -> {
            instance.add(value);
        });
    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet with one task add in
     * last que.
     */
    @Test
    public void testAdd_TaskInLast() {

        Task value = new Task("Luca", "basketball", "2023-06-17");

        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Caly", "dinner with family", "2023-05-30"));

        int expResult = 2;
        int result = instance.add(value);
        assertEquals(expResult, result);

        int expSize = 3;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);
    }

    /**
     * Test of peek method, of class BoundedPriorityQueueSet with empty que.
     */
    @Test
    public void testPeek_EmptyQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        assertThrows(NoSuchElementException.class, () -> {
            instance.peek();
        });

    }

    /**
     * Test of peek method, of class BoundedPriorityQueueSet with populated que.
     */
    @Test
    public void testPeek_PopulatedQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Caly", "dinner with family", "2023-05-30"));

        Task expResult = new Task("Ason", "clean house", "2023-05-11");
        Task result = instance.peek();
        assertEquals(expResult, result);

    }

    /**
     * Test of remove method, of class BoundedPriorityQueueSet with empty que.
     */
    @Test
    public void testRemove_EmptyQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        assertThrows(NoSuchElementException.class, () -> {
            instance.remove();
        });

    }

    /**
     * Test of remove method, of class BoundedPriorityQueueSet with populated
     * que.
     */
    @Test
    public void testRemove_PopulatedQue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Ason", "clean house", "2023-05-11"));
        instance.add(new Task("Caly", "dinner with family", "2023-05-30"));

        Task expResult = new Task("Ason", "clean house", "2023-05-11");
        Task result = instance.remove();
        assertEquals(expResult, result);

        int expSize = 1;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);

    }

}
