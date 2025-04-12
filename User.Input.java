//UserInput.java

import java.util.*;
class UserInput{
	int [] UserInput(){
	int[] numbers = new int[2];    //we declare static array
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter first number:");
	numbers[0] = scan.nextInt();
	
	System.out.println("Enter second number:");
	numbers[1] = scan.nextInt();
	
	return numbers;
	}
	int getIntInput(String message) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(message);
                value = scan.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scan.next(); // consume invalid input
            }
        }
        return value;
    }
    
    
    int[] getArrayInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
	
}
