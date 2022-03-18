public class StackByLinkedList {
    Node top;
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    //check stack is empty or not
    public boolean isEmpty(){
        if (top == null){
            return true;
        }
        else
            return false;
    }

    //insert at beginning
    public void push (int data){
         Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
        return;
    }
    //top value
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // remove at the beginning
    public void pop(){
        if (top == null){
            System.out.println("list is empty");
            return ;
        }
        else{
            int val = top.data;
            top = top.next;
            return;
        }
    }

    public void display(){
        if (top == null){
            System.out.println("stack underflow");
        }
        else {
            Node temp = top;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        StackByLinkedList obj = new StackByLinkedList();
        obj.push(15);
        obj.push(12);
        obj.push(16);
        obj.display();
        System.out.println("\n");
        System.out.println(obj.peek());
        obj.pop();
        obj.display();
    }
}
