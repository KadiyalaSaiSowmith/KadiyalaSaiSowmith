package mx.tc.j2se.tasks;
import java.util.Iterator;
import java.util.stream.Stream;

public abstract class AbstractTaskList implements Iterable<Task> {
    /*public AbstractTaskList()
    {

    }*/
    /*public abstract Stream<Task> getStream();*/

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

    public static Boolean Hashcode(ArrayTaskList t1,ArrayTaskList t2)
    {

        int i=0;
        if(t1.size() != t2.size()) {
          return false;
        }
        else
        {
            int s1 = t1.hashCode();
            int s2 = t2.hashCode();
            if(s1 != s2){
                System.out.println();
                System.out.println("HashCode Values of t1 and t2 objects are ");
                System.out.println(s1+" "+s2);
                return false;
            }
            return true;

        }
    }
    public Iterator<Task> iterator() {
        Iterator<Task> iter = new Iterator<Task>() {
            private int currentIndex = 0;
//            System.out.print("in iterator");

            @Override
            public boolean hasNext() {
                return currentIndex < size();
            }

            @Override
            public Task next() {
                if (hasNext()) return get(currentIndex++);
                else
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        return iter;
    }
}






