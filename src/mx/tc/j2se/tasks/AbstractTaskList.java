package mx.tc.j2se.tasks;
import java.util.Iterator;
public abstract class AbstractTaskList {
    /*public AbstractTaskList()
    {

    }*/
    public abstract void add(Task task);

    //public abstract void insertHead(Task data);
    public abstract Task get(int index);

    public abstract boolean remove(int index);

    public abstract void display();
    public abstract int size();


//    public abstract void insert(Task data);
    //  public abstract void insertHead(Task data);

    //public abstract void display();
    //  private Task[] arrayList;
    // private int Size;

    // @Override
    //@Override
    public Iterator<Task> iterator()
    {
        // OverRiding Default List Iterator //
        Iterator<Task> it = new Iterator<Task>()
        {
            private int currentIndex = 0;
            @Override
            public boolean hasNext()
            {
                // OverRiding Default hasNext  Method//
                return currentIndex < size() && get(currentIndex) != null;
            }
           // @Override
            public Task next()
            {
                // OverRiding Default next  Method//
                return get(currentIndex++);
            }
           // @Override
            public void remove()
            {
                // OverRiding Default Remove  Method.
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}






