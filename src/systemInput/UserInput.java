package systemInput;

import java.util.Scanner;

public class UserInput {
	
	

	public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

	}

}
