package mx.tc.j2se.tasks;


public class LinkedTaskList extends AbstractTaskList
{
    Node head;
    int size = 0;

        //function to add an element to the list at the end if there are element already and at the start if no elements are there
        public void add(Task data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                size++;
            }else {
                Node n = head;
                while(n.next != null) {
                    n = n.next;
                }
                n.next = newNode;
               size++;
            }
        }

        /*//function to add an element at the start of the list
        public void insertAtStart(int data) {
            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }*/

        //function to add an element at a given index
        /*public void insertAt(int index, int data) {
            if(index == 0){
                insertAtStart(data); //We already have a function to do this.
            }else{
                Node newNode = new Node(data);

                Node currentNode = head;
                for(int i = 0; i < index - 1; i++) {
                    currentNode = currentNode.next;
                }
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }
*/
        //function to delete an element at the given index
        public boolean remove(int index) {
            if(index == 0) {
                head = head.next;
               // return head;
                return true;
            }else{
                Node currentNode = head;
                for(int i = 0; i < index - 1; i++) {
                    currentNode = currentNode.next;
                }
                currentNode.next = currentNode.next.next;
                return true;
            }

        }

        // get method
        public Task get(int index) {
            int i = 0;
            Node current = head;
            while (current != null) {
                if (i == index) {
                    break;
                }
                current = current.next;
                i++;
            }
            return current.data;
        }
        public int size()
        { int i=0;
            Node current = head;
            while(current!=null)
            {
                current =  current.next;
                i++;

            }
            return i;
        }

            //function to show the list
            public void display () {
                Node currentNode = head;
                if (currentNode == null) {
                    System.out.println("Linked list is empty");
                } else {
                    while (currentNode != null) {
                        System.out.print(currentNode.data + " ");
                        currentNode = currentNode.next;
                    }
                }
            }

            // implementing hashcode methods

        }
