package DataStructures;

import ApplicationData.Appointments;
import java.lang.reflect.Array;

/**
 *
 * @author Mercy Soh Xi En
 */
public class LinkedList {

    protected Node first;
    protected Node last;
    protected int size;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     *Get the size of appointments list.
     *
     * @return size in appointments list
     */
    public int size() {
        return size;
    }

    /**
     * Get the value from the specified position of appointments list.
     *
     * @param pos is use for the specified position
     * @return value of the specified position from appointments list
     * @throws IndexOutOfBoundsException when the position is less than 0 or greater than size 
     */
    public Appointments get(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Illegal position supplied.");
        }
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

  /**
     * Returns specified value's position when it founded in appointments list.
     *
     * @param value is use for the specified value
     * @return position of specified value in appointments list when founded else return -1 when it not be founded
     */
    public int indexOf(Appointments value) {

        if (first == null) {
            return -1;
        }

        Node current = first;

        for (int i = 0; i < size; i++) {
            if (current.data.equals(value)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }
    
     /**
     *Adds an appointments to the end of the appointments list.
     *
     * @param value is use for the specified value
     * @return true when added else return false
     */
    public boolean add(Appointments value) {
        Node newNode = new Node(value);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
        return true;
    }

    protected static class Node {

        protected Appointments data;
        protected Node next;

        public Node(Appointments value) {
            this.data = value;
            this.next = null;
        }

    }
}
