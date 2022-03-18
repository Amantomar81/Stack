public class StackByArray {
    int arr[];
    int topofStack;
    public StackByArray(int size){
        arr = new int[size];
        topofStack = -1;
    }

    public boolean isStackFull(){
        if (topofStack == arr.length-1)
        {
            System.out.println("Stack is full");
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isStackEmpty(){
        if(topofStack == -1){
            return true;
        }
        else {
            return false;
        }
    }

    public void push( int value)
    {
        if( topofStack == arr.length-1)
        {
            System.out.println("stack is full");
        }
        else
        {
            arr[topofStack+1 ] = value;
            System.out.println("successfully inserted value");
        }
    }
    public void pop( int value)
    {
        if( topofStack == -1)
        {
            System.out.println("stack underflow error");
        }
        else
        {
            System.out.println(arr[topofStack]);
            topofStack--;
        }
    }


    public void peek()      //print top value
    {
        if(!isStackEmpty()){
            System.out.println(arr[topofStack]);
        }
        else {
            System.out.println("Stack is Empty");
        }
    }


    public static void main(String[] args) {
        StackByArray obj = new StackByArray(10);
        obj.isStackFull();
        obj.isStackEmpty();
        obj.push(15);
        obj.push(2);
        obj.push(5);
        obj.pop(2);
        obj.peek();
    }
}
