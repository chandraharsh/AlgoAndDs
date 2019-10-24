package stack;


public class StackImpl {

    private int capacity = 0;

    @Override
    public String toString() {

        String result = "";
        for (Integer a :stack) {
            if(a!=null)
            result += String.valueOf(a) + ",";
        }
        return result;
    }

    public int getTop() {
        return top;
    }

    public int top = -1;

    private Integer[] stack = null;

    public int getCapacity() {
        return capacity;
    }

    public StackImpl(int capacity){
        this.capacity = capacity;
        this.stack = new Integer[capacity];
    }


    public void push(Integer i) {

        if(top == capacity - 1){
            System.out.println("stack is full");
            return;
        }
        else{
            top++;
            stack[top] = i;

        }

    }

    public Integer pop() {

        if(top == -1) {
            System.out.println("stack is empty");
            return null;
        }
        else {
            Integer j = stack[top];
            stack[top] = null;
            top--;
            return j;
        }

    }

    public static void main(String[] args) {
      //  StackImpl stack = new StackImpl(1);
      //  StackImpl stack1 = new StackImpl(2);
      //  stack.push(1);
      //  stack.push(2);
       // stack.push(3);
        //stack.pop();

    }
}
