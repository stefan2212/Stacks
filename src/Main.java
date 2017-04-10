import java.util.Arrays;

class Stack{
    private int[] Elements;
    private int size;
    private int top = -1;

    Stack(int size){
        this.size=size;
        Elements = new int[size];
        Arrays.fill(Elements, -1);
    }

    public void push(int input){
        if(top+1<size){
            top++;
            Elements[top]=input;
        }
        else{
            System.out.print("Stack is full");
        }
    }

    public void displayStack(){
        for (int i=0;i<top;i++){
            System.out.print(Elements[i]+" ");
        }
        System.out.println();
    }

    public void pop(){
        if(top>=0){
            Elements[top]=-1;
            top--;
        }
        else{
            System.out.println("The stack is empty");
        }
    }

    public void peek(){
        System.out.println(Elements[top]);
    }
}

public class Main {

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(2);
        s.push(3);
        s.push(4);
        s.displayStack();
    }
}
