package mx.tc.j2se.tasks;
import java.util.*;
public class ArrayTaskList extends AbstractTaskList {

    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Task elementData[] = {};


   public void ArrayTaskListincoming(int from,int to) {

       for (int i = 0; i < size; i++)
       {
           if (from < elementData[i].getStart()  & elementData[i].getStart()< to)
           {
               System.out.println('\n');
               System.out.println(elementData[i]);
               //System.out.println("hi");
           }
       }
   }

    public ArrayTaskList() {
        elementData = new Task[INITIAL_CAPACITY];

    }

    public void add(Task task) {
        if (size == elementData.length) {
            ensureCapacity(); // increase current capacity of list, make it
            // double.
        }
        elementData[size++] = task;
    }
    @SuppressWarnings("unchecked")
    public Task get(int index) {
        // if index is negative or greater than size of size, we throw
        // Exception.

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return (Task) elementData[index]; // return value on index.
    }
    public boolean remove(int index) {
        // if index is negative or greater than size of size, we throw
        // Exception.
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        Task removedElement = elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--; // reduce size of ArrayListCustom after removal of element.

        return true;
    }
    private void ensureCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }

    /**
     * Display custom/your own ArrayList.
     *
     * Method displays all the elements in list.
     */

    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
           // System.out.println();

        }
    }

}


