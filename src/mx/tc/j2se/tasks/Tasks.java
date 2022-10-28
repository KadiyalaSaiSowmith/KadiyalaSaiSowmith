package mx.tc.j2se.tasks;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Iterator;

public class Tasks {
    public static Iterator<Task>  incoming(Iterator<Task> Iter99, LocalDateTime from, LocalDateTime to)
    {
        ArrayTaskList ATL99 = new ArrayTaskList();
       // System.out.println(Iter99.hasNext());
        while (Iter99.hasNext())
        {
            Task i = Iter99.next();
//            System.out.println(elementData[i].getStart()+" "+from+" "+to);
         // System.out.println(i.getStart().isAfter(from));
       //  System.out.println(i.getStart().isBefore(to));

            if ((i.getStart().isAfter(from)) && (i.getStart().isBefore(to)))
            {
              //  System.out.println("hi");
                ATL99.add(i);
            }
        }
        Iterator<Task> itret = ATL99.iterator();
return itret;
    }
}
