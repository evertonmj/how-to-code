package br.com.everdev.examples.stacks;

import static br.com.everdev.examples.utils.IOUtils.printn;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack(1);
        stack.printStack();

        stack.push(2);
        stack.printStack();

        stack.push(3);
        stack.push(87);
        stack.printStack();

        Node node = stack.pop();
        printn("Poped out: "+ node.value);
        stack.printStack();

        node = stack.pop();
        printn("Poped out: "+ node.value);
        stack.printStack();
    }
}
