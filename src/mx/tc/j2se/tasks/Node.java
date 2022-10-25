package mx.tc.j2se.tasks;
public class Node {
    Task data; //Data in the current node
    Node next; //Reference for the next node

    //Constructor which takes an int value which is stored as the data in this Node object.
    Node(Task data) {
        this.data = data;
    }
}