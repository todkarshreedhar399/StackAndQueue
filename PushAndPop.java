public class UC2_PopAndPush {
    private int[] arr;
    private int size;
    private int top;

    public PushAndPop(int size) {
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int data){
    if(isFull()){
        System.out.println("Stack is full");
        System.exit(1);
    }
    arr[++top] = data;
    }

    public void pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        int pop = this.arr[top--];
        System.out.println("this element has been popped: " +pop);
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    public boolean isFull(){
    return (top == size - 1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    void display(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
      PushAndPop createStack = new PushAndPop(3);
       createStack.push(70);
       createStack.push(30);
       createStack.push(56);
       createStack.display();
       createStack.pop();
      createStack.display();
       int value = createStack.peek();
       if (value == -1){
           System.out.println("stack is empty");
       }
       else {
           System.out.println("top element is: " +value);
       }
    }
}
