package morningchallenge;

/**
 * Created by Jay Vaghani
 */

import java.util.Scanner;

/**
 * Write a java program to print your name
 */
public class PrintMyName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name : ");
        String name = scanner.nextLine();
        PrintMyName name1 = new PrintMyName();
        name1.printMyName(name);

        scanner.close();
    }

    public void printMyName(String name){
        System.out.println("My name is : " + name);
    }

}
