package br.com.everdev.data_structures.recursions;

import static br.com.everdev.data_structures.utils.IOUtils.print;
import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class CallStack {

    public static final Integer stopCondition = 100;

    public static void main(String[] args) {
        printn("Calling recursively...");

        int total = recursiveMethod(10);

        printn("Total: "+total);
    }

    public static int recursiveMethod(int value) {
        print("Value: "+ value + "\n");
        printn("--");
        if (value < stopCondition) {
            printn("Running again...");
            value = recursiveMethod(value * 2);
        } else {
            printn("Recursion end!");
        }
        return value;
    }
}
