public class PushStack {
    private int[] arr;
    private int size;
    private int top;

    public PushStack(int size) {
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }
    public void push(int data){
    if(isFull()){
        System.out.println("Stack is full");
        System.exit(1);
    }
    arr[++top]=data;
    }
    public boolean isFull(){
    return (top == size - 1);

    }
    void display(){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
       PushStack createStack = new PushStack(3);
       createStack.push(70);
       createStack.push(30);
       createStack.push(56);
       createStack.display();
    }
}
