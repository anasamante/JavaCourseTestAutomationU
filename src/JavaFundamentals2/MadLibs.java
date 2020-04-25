package IndependentExercise;

import java.util.Scanner;

public class MadLibs {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        //1. ask for a season of the year
        System.out.println("Enter a season of the year:");
        String season = scanner.next();

        //2. ask for a whole number
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        //3. ask for an adjective
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        scanner.close();

        //4. Display the result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee" );

    }
}
