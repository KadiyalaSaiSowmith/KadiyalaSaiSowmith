package mx.tc.j2se.tasks;
public class Node {

    private Task data;
    private Node nextNode;

    public Node(Task data){
        this.data = data;
    }

    public Task getData() {
        return data;
    }

    public void setData(Task data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
