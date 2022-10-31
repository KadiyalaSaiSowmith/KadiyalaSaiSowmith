package mx.tc.j2se.tasks;
import java.time.LocalTime;
import java.util.Iterator;
import java.time.LocalDateTime;
import java.util.Scanner;
// below imports are used for extra detailing
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // (way to initialize date objects) LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);

        // declaring from and to values
        LocalDateTime from = LocalDateTime.of(2020, 1, 14,9,00,00);
        LocalDateTime to=LocalDateTime.of(2023, 11, 14,10,00,00);;

        /*  just for the experiment purpose
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);*/

       /* To know the documentation ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.stream().iterator(); import java.util.ArrayList;*//*


        // Task1 (assigning the values through getter, setter and constructor)
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
       *//*TaskListFactory TLF1 = new TaskListFactory();

        AbstractTaskList ATL1= TLF1.createTaskList(ListTypes.types.ARRAY);
        ATL1.add(obj2);
        Iterator<Task> aa = ATL1.iterator();
       while(aa.hasNext())
       {
           System.out.println(aa.next().toString()+"Hello World");
       }
        AbstractTaskList ATL2= TLF1.createTaskList(ListTypes.types.LINKED);*//*
       // must add some objects to linked list by eod
        *//*Task obj12 = new Task("Raghu",13,20,2);
        Task obj13 = new Task("Sowmith",2,20,1);*//*

*/
        Task t1=new Task("Lunch with Beautiful girl", LocalDateTime.of(2022, 8,24,8,15));
        Task obj2 = new Task("Go to Home",LocalDateTime.of(2022, 10,27,18,00));
        Task obj3 = new Task("Come back to Office",LocalDateTime.of(2022, 10,28,9,30));
        Task t2=new Task("Morning run",LocalDateTime.of(2022, 3,1,8,15),LocalDateTime.of(2022, 9,1,8,15), LocalTime.of(10,0,0));
      //  System.out.println(t1.nextTimeAfter(LocalDateTime.of(2022, Month.valueOf("AUGUST"),24,8,15)));
        // //AbstractTaskList abobject=new ArrayTaskList(); // t
        // creating ArrayTaskList class object using TaskListFactory
        TaskListFactory tf =new TaskListFactory();
     AbstractTaskList abobject = tf.createTaskList(ListTypes.types.ARRAY);
     //System.out.
      //  abobject.add(obj);
        abobject.add(obj2);
        abobject.add(obj3);
        abobject.add(t2);

        System.out.println("Displaying ArrayTaskList using TaskListFactory"+'\n');
        abobject.display();

       // abobject.add(obj10);

        // creating Linked Task list class object using TaskListFactory
        TaskListFactory tf2 =new TaskListFactory();
        AbstractTaskList abobject3 = tf.createTaskList(ListTypes.types.LINKED);
        abobject3.add(obj2);
        abobject3.add(obj3);
        System.out.println("Displaying LinkedTaskList using TaskListFactory "+'\n');
        //abobject3.display();

        Iterator<Task> itr = abobject.iterator();
        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method
        System.out.print("\nUSING ITERATORS TO DISPLAY THE ARRAYLIST ELEMENTS ");
        while (itr.hasNext()) {
            //  Moving cursor to next element
            Task i = itr.next();
//            System.out.println("in list");
            // Getting elements one by one
            System.out.print(i + " ");
            // Removing odd elements
        }
        System.out.print("\nDISPLAY THE ARRAYLIST ELEMENTS ");
        abobject.display();



       AbstractTaskList abobject2=new LinkedTaskList(); // t
      //  abobject2.add(obj);
        abobject2.add(obj2);
        abobject2.add(obj3);
       // abobject2.add(obj10);

        Iterator<Task> itr2 = abobject2.iterator();
        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method
        System.out.print("\nUSING ITERATORS TO DISPLAY THE LINKEDLIST ELEMENTS ");
        while (itr2.hasNext()) {
            //  Moving cursor to next element
            Task m = itr2.next();
//            System.out.println("in list");
            // Getting elements one by one
            System.out.println(m + " "+"LINKED ");
            // Removing odd elements
        }
        System.out.print("\nDISPLAY THE LINKEDLIST ELEMENTS ");
        abobject2.display();
       // to do create using AbstractTaskfactory
        ArrayTaskList o1 = new ArrayTaskList();
        o1.add(obj2);
        o1.add(obj3);
        ArrayTaskList o2 = new ArrayTaskList();
        o2.add(obj2);
        o2.add(obj3);

//System.out.println(o1.get(0)+"hello");
   //   ArrayTaskList obb = new ArrayTaskList();
        System.out.println(AbstractTaskList.Hashcode(o1,o2));

        // calling incoming method

        System.out.println('\n');
        System.out.println('\n');
        System.out.println('\n');
//        ListInComingMethod.add(t1);
//        ListInComingMethod.add(obj2);
//        ListInComingMethod.add(obj3);

        System.out.println("Checking Incoming method");
        TaskListFactory TLF99 =new TaskListFactory();
        AbstractTaskList Array99 = tf.createTaskList(ListTypes.types.ARRAY);
        Array99.add(t2);
        System.out.println(Array99.getStream()+"Hi");
        Iterator<Task> Iter99 = Array99.iterator();
        Iterator<Task> ans = Tasks.incoming(Iter99,from, to);

        while (ans.hasNext()) {
            //  Moving cursor to next element
            Task i = ans.next();
//            System.out.println("in list");
            // Getting elements one by one
            System.out.print(i);
            // Removing odd elements
        }


    }

}