public class Runner {

    public static void main(String[] args) {
        // Object Creation
        ManshiStack stk = new ManshiStack(5);

        stk.push(5);
        stk.push(10);
        stk.push(15);
        System.out.println(stk.IsEmpty());
        stk.pop();

        System.out.println(stk.IsEmpty());

        
        // From object, I can access its instance variables & methods using (.) operator.

        // Acesss Static variables from object.
        // We can access static from object, however, its not best practice.
        // prefer using class names.

//        ManshiStack.aman


    }
}
