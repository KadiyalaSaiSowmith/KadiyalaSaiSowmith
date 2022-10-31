package mx.tc.j2se.tasks;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class ArrayTaskList extends AbstractTaskList {

    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Task elementData[] = {};

    public ArrayTaskList() {
        elementData = new Task[INITIAL_CAPACITY];

    }
    public Stream<Task> getStream()
    {
        return Stream.of(this.elementData);

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

    public int size()
    {
        return size;
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


    /*public boolean equals(Task obj,Task obj2) {
     System.out.println(obj);
     System.out.println(obj2);
 if(obj.toString().equals(obj2.toString()))
      {
          return true;
       }
      return false;
    }


    public void hashcode(Task task1,Task task2) {
        if(task1.toString().equals(task2.toString())) {

            System.out.println("hashcode of t1:" + task1.hashCode() );
            System.out.println("hashcode of t2:" + task2.hashCode() + " ");

        }
       System.out.println("hash codes of equal tasks");
    }*/

}


