package org.app;

import org.app.fifthSubtask.FifthSubtask;
import org.app.firstSubtask.FirstSubtask;
import org.app.fourthSubtask.FourthSubtask;
import org.app.secondSubtask.SecondSubtask;
import org.app.sixthSubtask.SixthSubtask;
import org.app.thirdSubtask.ThirdSubtask;

public class App {

    public static void main( String[] args ) {

        while (true) {

            Integer navigationVar = MyInput.inputInteger("""
                    Navigation menu:
                    Enter 1 to run first subtask.
                    Enter 2 to run second subtask and etc. up to 8.
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
                    ThirdSubtask thirdSubtask = new ThirdSubtask();
                    String input = MyInput.inputString("Input expression:", v -> v);
                    thirdSubtask.find(input);
                    break;
                }
                case 4: {
                    FourthSubtask fourthSubtask = new FourthSubtask();
                    String input = MyInput.inputString("Input date:", v -> v);
                    if (fourthSubtask.isCorrect(input)) {
                        System.out.println("Entered date is correct");
                    } else {
                        System.out.println("Entered date is incorrect");
                    }
                    break;
                }
                case 5: {
                    FifthSubtask fifthSubtask = new FifthSubtask();
                    String input = MyInput.inputString("Input e-mail:", v -> v);
                    if (fifthSubtask.isCorrect(input)) {
                        System.out.println("Entered e-mail is correct");
                    } else {
                        System.out.println("Entered e-mail is incorrect");
                    }
                    break;
                }
                case 6: {
                    SixthSubtask sixthSubtask = new SixthSubtask();
                    String input = MyInput.inputString("Input password:", v -> v);
                    if (sixthSubtask.isCorrect(input)) {
                        System.out.println("Entered password is correct");
                    } else {
                        System.out.println("Entered password is incorrect");
                    }
                    break;
                }
                default:
                    System.exit(1);
                    break;
            }
        }
    }
}
