package vms_system;

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		ValuableManager valuableManager = new ValuableManager(input);

		while (num != 5) { //Repeatedly print menu
			System.out.println("****Valuable Management System menu****");
			System.out.println("1. Add valuable");
			System.out.println("2. Delete valuable");
			System.out.println("3. Edit valuable");
			System.out.println("4. View valuables");
			System.out.println("5. Exit");
			//Printing Menu about management system

			System.out.println("Select one number between 1-5: ");
			num = input.nextInt();
			//Take number from user

			if(num==1)
				valuableManager.addValuable();

			else if(num==2)
				valuableManager.deleteValuable();
			
			else if(num==3)
				valuableManager.editValuable();
		
			else if(num==4)
				valuableManager.viewValuables();
			
			else
				continue;
		}
	}
}
	