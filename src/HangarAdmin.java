import java.util.Scanner;

public class HangarAdmin {
	private static Scanner in = new Scanner(System.in);
	

	public static void main(String[] args) {
		Hangar fleetHome = new Hangar();
		
		start(fleetHome);
		
	}

	public static void start(Hangar hangar) {
		
		boolean quit = false;
		
		while(!quit){
		System.out.println("Welcome to FleetHome.\nSelect 1 to list the fleet.\nSelect 2 to view the fastest jet\n"
				+ "Select 3 to view the Jet with the longest range\nSelect 4 to add a jet to the fleet.\nSelect 5 to quit\n");
		
		int choice = in.nextInt();
		
		if(choice<= 0 || choice >5){
			System.out.println("That was an invalid choice\n ");
			continue;
		}
		if(choice == 5){
			System.out.println("Leaving the hangar. Bye.");
			break;
		}
		
		hangarMenu(choice, hangar);
		
		
		}
	}
	
	public static void hangarMenu(int choice, Hangar hangar){
		
		switch(choice){
		case 1: 
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}
	
	
}