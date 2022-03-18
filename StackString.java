
import java.util.Scanner;
import java.util.Stack;

public class StackString {

    static char[] stack;
    static int top;
    StackString(){};
    StackString(int size)
    {
        stack = new char[size];
        top = -1;
    }
    public void push(char data)
    {
        stack[++top] = data;
    }
    public char pop()
    {
        return stack[top--];
    }
    public String reverse(String s)
    {
        StackString obj = new StackString(s.length());
        for(int i=0;i<s.length();i++)
        {
            push(s.charAt(i));
        }
        String res = "";
        for(int i=0;i<s.length();i++)
        {
            res+=pop();
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        StackString obj = new StackString();
        System.out.println(obj.reverse(s));
    }
}
