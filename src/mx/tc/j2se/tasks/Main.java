package mx.tc.j2se.tasks;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int from = 10;
        int to = 20;
        Task obj = new Task(); // setting values using getter and setter methods
        Task obj2 = new Task("Raghu",13,20,2);
        Task obj3 = new Task("Diwakar",1);
        obj.setTitle("Arjun");
        obj.setActive(true);
       // obj.set
        obj.setTime(-1);
        ArrayTaskList abc = new ArrayTaskList();
        //Add elements in custom ArrayList
        abc.add(obj);
        abc.add(obj2);
        abc.add(obj3);
        //Display custom ArrayList
        abc.display();
        System.out.println("\nelement at index in custom ArrayList > " + 0 + " = " + abc.get(0));

        //Remove element from custom ArrayList
        System.out.println("element removed from index " + 0 + " = "
           + abc.remove(0));

        //Again display custom ArrayList
        //System.out.println("\nlet's display custom ArrayList again after removal at index 0");

      abc.display();

      System.out.println("Displaying LinkedList Content");
        Task obj10 = new Task();
        obj10.setTitle("Varsh");
       // System.out.println("Enter the Starting Time");
       // Scanner sc = new Scanner(System.in);
    //   int c= sc.nextInt();
        obj10.setTime(23);
     //   obj10.setStart(c);
        obj10.setEnd(36);
        obj10.setInterval(2);
        obj10.setActive(true);
        LinkedTaskList xyz = new LinkedTaskList();
        xyz.add(obj10);
        xyz.display();
        abc.ArrayTaskListincoming(from,to);
    // AbstactTaskList www = new AbstarctTaskList();
       TaskListFactory TLF1 = new TaskListFactory();

        AbstractTaskList ATL1= TLF1.createTaskList(ListTypes.types.ARRAY);
        ATL1.add(obj2);
        Iterator<Task> aa = ATL1.iterator();
       while(aa.hasNext())
       {
           System.out.println(aa.next().toString()+"Hello World");
       }
        AbstractTaskList ATL2= TLF1.createTaskList(ListTypes.types.LINKED);
       // must add some objects to linked list by eod
        /*Task obj12 = new Task("Raghu",13,20,2);
        Task obj13 = new Task("Sowmith",2,20,1);*/




    }
}