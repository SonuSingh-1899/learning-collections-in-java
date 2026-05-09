package List;

import java.util.LinkedList;
import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        // this is how to impliment stack 
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.search(2));

        // we can use linkedlist as a stack form
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.addLast(1);
        nums.addLast(2);
        nums.addLast(3);
        nums.addLast(4);
        nums.addLast(5);
        System.out.println(nums);
        System.out.println(nums.indexOf(4));
        System.out.println(stack.pop());
    }
}
