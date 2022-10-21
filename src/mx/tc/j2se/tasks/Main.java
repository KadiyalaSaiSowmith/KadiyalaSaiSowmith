package mx.tc.j2se.tasks;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;


public class Main {
    public static void main(String[] args) {
//"Sowmith",2010
        Task obj3 = new Task("Diwakar",1);
        Task obj = new Task();
        Task obj2 = new Task("Raghu",13,20,2);
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


    }
}