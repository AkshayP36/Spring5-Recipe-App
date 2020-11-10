public class Main {
    public static void main(String[] args){

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Mumbai","Indians",1));
        stack.push(new Employee("Royal Challengers","Bangaluru",2));
        stack.push(new Employee("Chennai","Superkings",3));

        stack.printStack();
        System.out.println("--------------------");
        stack.pop();stack.pop();
        stack.printStack();
        System.out.println("----------------------");
        System.out.println(stack.peek());

    }


}
