package com.frank;

import java.util.Stack;

public class ExampleStack {

    private static Stack<String> pastCommands = new Stack<>();
    private static Stack<String> futureCommands = new Stack<>();

    public static void undo() {
        //adding to the future and
                    //removing from the past
        if (!pastCommands.isEmpty()) {
        futureCommands.push(pastCommands.pop());
        }

    }


    public static void redo () {
        if (!futureCommands.isEmpty()) {
            pastCommands.push(futureCommands.pop());
        }

    }
    public static void main(String[] args) {
        pastCommands.push("Draw box");
        pastCommands.push("Fill in the box");
        pastCommands.push("Change the color");
        pastCommands.push("Draw a circle");
        pastCommands.push("Move the circle ");

        System.out.println(pastCommands);
        System.out.println("very last thing done: " + pastCommands.peek());

        undo();
        System.out.println("very last thing done: " + pastCommands.peek());



    }

}

