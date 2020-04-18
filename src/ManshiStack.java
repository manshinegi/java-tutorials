public class ManshiStack {

    // stack of integers , in which I can push and pop.
    // Variables
    private int[] arr ;
    private int topOfStack;

    public ManshiStack(int size ) {
        this.arr = new int[size];
        this.topOfStack = -1;
    }

    // Methods
    // Behaviours
    public void pop() {
        this.arr[topOfStack--] = 0;
    }

    public void push(int value) {
        this.arr[++topOfStack] = value;
    }

    public boolean IsEmpty() {
        if (topOfStack < 0) {
            return true;
        }
        return false;
    }

}