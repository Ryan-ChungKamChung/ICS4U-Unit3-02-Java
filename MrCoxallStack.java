/*
 * This program pushes and prints a stack.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-12-07
 */

import java.util.ArrayList;

/** This class contains the contents of a stack. */
public class MrCoxallStack {

    /** ArrayList signifying a stack. */
    private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

    /**
     * Pushes the input into the stack.
     *
     * @param pushNumber The number to be added to the array
     */
    public void push(final int pushNumber) {
        stackAsArray.add(0, pushNumber);
    }

    /** Removes the top element in the stack. */
    public void pull() {
        stackAsArray.remove(0);
    }

    /** Prints out the stack. */
    public void showStack() {
        for (int element : stackAsArray) {
            System.out.println(element);
        }
    }
}

