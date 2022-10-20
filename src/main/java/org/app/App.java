package org.app;

import org.app.firstSubtask.FirstSubtask;
import org.app.secondSubtask.SecondSubtask;

public class App {

    public static void main( String[] args ) {

        while (true) {

            Integer navigationVar = MyInput.inputInteger("""
                    Navigation menu:
                    Enter 1 to run first subtask.
                    Enter 2 to run second subtask.
                    Enter 3 to run third subtask.
                    Enter 4 to run fifth subtask;
                    Enter any other digit to stop the program.""", Integer::valueOf);

            switch (navigationVar) {
                case 1: {
                    FirstSubtask firstSubtask = new FirstSubtask();
                    String input = MyInput.inputString("Input a string:", v -> v);
                    if (firstSubtask.isString(input)) {
                        System.out.println("Entered sequence is a string");
                    } else {
                        System.out.println("Entered sequence is not a string");
                    }
                    break;
                }
                case 2: {
                    SecondSubtask secondSubtask = new SecondSubtask();
                    String input = MyInput.inputString("Input prices:", v -> v);
                    secondSubtask.getValues(input);
                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                default:
                    System.exit(1);
                    break;
            }
        }
    }
}
