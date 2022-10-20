package mx.tc.j2se.tasks;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;


public class Main {
    public static void main(String[] args) {

        Task obj = new Task("Sowmith",2010);
        ArrayTaskList abc = new ArrayTaskList();
        //Add elements in custom ArrayList
        abc.add(obj);

        //Display custom ArrayList
        abc.display();
        System.out.println("\nelement at index in custom ArrayList > " + 1 + " = " + abc.get(0));

        //Remove element from custom ArrayList
        System.out.println("element removed from index " + 1 + " = "
                + abc.remove(0));

        //Again display custom ArrayList
        System.out.println("\nlet's display custom ArrayList again after removal at index 1");

        abc.display();


    }
}